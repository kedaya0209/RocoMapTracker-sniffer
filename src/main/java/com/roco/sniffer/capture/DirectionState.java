package com.roco.sniffer.capture;

import com.roco.sniffer.codec.Be21Parser;
import com.roco.sniffer.codec.Be21Packet;
import com.roco.sniffer.codec.Direction;

import java.io.ByteArrayOutputStream;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.NotThreadSafe;

/**
 * TCP 流重组器：按序列号将 TCP 段拼接为连续字节流，再交给 BE21 解析器。
 * <p>
 * 对应 Python: rkpp_network.py DirectionState
 * <p>
 * 处理：乱序、重传、重叠、gap 缓存、缓冲区溢出保护。
 */
@Slf4j
@NotThreadSafe
public class DirectionState {

    /** 缓冲区上限 16MB，超过则 trim */
    private static final int MAX_BUFFER_SIZE = 16 * 1024 * 1024;
    /** 乱序缓存上限 8MB，超过则丢弃最远的段 */
    private static final int MAX_PENDING_BYTES = 8 * 1024 * 1024;

    private final Direction direction;

    /** 主字节流缓冲区 */
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    /** 已解析到的偏移（buffer 内的相对位置） */
    private int parseOffset = 0;
    /** buffer[0] 对应的绝对流偏移 */
    private long streamBase = 0;

    /** 首次调用时记录的起始序列号 */
    private Long baseSeq = null;
    /** 下一个期望的连续序列号 */
    private Long nextContigSeq = null;

    /** 乱序段缓存: seq → payload */
    private final TreeMap<Long, byte[]> pending = new TreeMap<>();
    /** 乱序缓存总字节数 */
    private int pendingBytes = 0;

    public DirectionState(Direction direction) {
        this.direction = direction;
    }

    /**
     * 喂入一个 TCP 段，返回解析出的 BE21 帧列表。
     *
     * @param seq     TCP 序列号
     * @param payload TCP 载荷
     * @return 解析出的 BE21 帧
     */
    public List<Be21Packet> feed(long seq, byte[] payload) {
        if (payload == null || payload.length == 0) return List.of();

        if (baseSeq == null) {
            // 首次调用
            baseSeq = seq;
            buffer.write(payload, 0, payload.length);
            nextContigSeq = seq + payload.length;
        } else {
            ingestSegment(seq, payload);
        }

        // 缓冲区溢出保护
        if (buffer.size() > MAX_BUFFER_SIZE) {
            trimBuffer();
        }

        long base = streamBase;
        byte[] bufData = buffer.toByteArray();
        Be21Parser.ParseResult result = Be21Parser.parse(bufData, direction, parseOffset);
        parseOffset = result.newOffset();

        // 修正 stream_offset 为绝对偏移
        List<Be21Packet> packets = new ArrayList<>();
        for (Be21Packet pkt : result.packets()) {
            packets.add(new Be21Packet(
                    pkt.direction(),
                    pkt.streamOffset() + base,
                    pkt.cmd(),
                    pkt.seq(),
                    pkt.hdrLen(),
                    pkt.bodyLen(),
                    pkt.headerExtra(),
                    pkt.body()
            ));
        }

        // 定期 trim 前端已消费的字节
        if (parseOffset >= 0x10000 && parseOffset > buffer.size() / 2) {
            trimFront(parseOffset);
        }

        return packets;
    }

    private void ingestSegment(long seq, byte[] payload) {
        long end = seq + payload.length;

        // 情况1: 段在 base 之前（可能需要前置拼接）
        if (seq < baseSeq) {
            if (end < baseSeq) {
                log.debug("DirectionState[{}] dropping non-contiguous old segment seq={} end={} base={}",
                        direction, seq, end, baseSeq);
                return;
            }
            int prependLen = (int) (baseSeq - seq);
            if (prependLen > 0) {
                byte[] newBuf = new byte[prependLen + buffer.size()];
                System.arraycopy(payload, 0, newBuf, 0, prependLen);
                byte[] old = buffer.toByteArray();
                System.arraycopy(old, 0, newBuf, prependLen, old.length);
                buffer.reset();
                buffer.write(newBuf, 0, newBuf.length);
                baseSeq = seq;
                parseOffset += prependLen;
                streamBase = Math.max(0, streamBase - prependLen);
            }
            if (end <= nextContigSeq) return;
            // 截取重叠之后的部分继续处理
            int start = (int) (nextContigSeq - seq);
            payload = Arrays.copyOfRange(payload, start, payload.length);
            seq = nextContigSeq;
            if (payload.length == 0) return;
        }

        // 情况2: 段与当前连续流有交集或紧邻
        if (seq <= nextContigSeq) {
            int start = (int) (seq - baseSeq);
            long overlap = nextContigSeq - seq;

            if (overlap > 0 && start >= 0) {
                overlap = Math.min(overlap, payload.length);
                // 检测冲突重传
                byte[] existing = new byte[(int) overlap];
                byte[] oldBuf = buffer.toByteArray();
                System.arraycopy(oldBuf, start, existing, 0, (int) overlap);
                byte[] incoming = Arrays.copyOf(payload, (int) overlap);

                if (!Arrays.equals(existing, incoming)) {
                    if (start < parseOffset) {
                        log.debug("DirectionState[{}] ignoring conflicting retransmit over parsed bytes seq={}",
                                direction, seq);
                        return;
                    }
                    log.warn("DirectionState[{}] replacing conflicting overlap at seq={} (existing={} incoming={})",
                            direction, seq, bytesToHex(existing, 8), bytesToHex(incoming, 8));
                    // 截断 buffer 到冲突点，追加新数据
                    truncateBuffer(start);
                    buffer.write(payload, 0, payload.length);
                    nextContigSeq = seq + payload.length;
                    parseOffset = Math.min(parseOffset, start);
                    drainPending();
                    return;
                }
            }

            if (overlap >= payload.length) return;

            // 追加非重叠部分
            int nonOverlap = (int) (payload.length - overlap);
            buffer.write(payload, (int) overlap, nonOverlap);
            nextContigSeq += nonOverlap;
            drainPending();
            return;
        }

        // 情况3: 段在连续流之后（有 gap），存入 pending
        storePending(seq, payload);
    }

    private void storePending(long seq, byte[] payload) {
        long end = seq + payload.length;

        // 检查是否被已有 pending 完全覆盖
        Map.Entry<Long, byte[]> floor = pending.floorEntry(seq);
        if (floor != null) {
            long oldEnd = floor.getKey() + floor.getValue().length;
            if (floor.getKey() <= seq && oldEnd >= end) return;
        }

        // 移除被当前段完全覆盖的 pending
        Iterator<Map.Entry<Long, byte[]>> it = pending.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, byte[]> e = it.next();
            long oldSeq = e.getKey();
            long oldEnd = oldSeq + e.getValue().length;
            if (seq <= oldSeq && end >= oldEnd) {
                pendingBytes -= e.getValue().length;
                it.remove();
            }
        }

        // 如果同 seq 已有更短的，替换
        byte[] existing = pending.get(seq);
        if (existing != null) {
            if (existing.length >= payload.length) return;
            pendingBytes -= existing.length;
        }

        pending.put(seq, payload);
        pendingBytes += payload.length;

        // 溢出保护：丢弃最远的段
        while (pendingBytes > MAX_PENDING_BYTES && !pending.isEmpty()) {
            long farthest = pending.lastKey();
            byte[] dropped = pending.remove(farthest);
            pendingBytes -= dropped.length;
            log.warn("DirectionState[{}] pending cache exceeded {} bytes, dropping segment at seq={}",
                    direction, MAX_PENDING_BYTES, farthest);
        }
    }

    private void drainPending() {
        while (true) {
            // 找到所有 seq <= nextContigSeq 的 pending 段
            Long readySeq = null;
            for (long s : pending.keySet()) {
                if (s <= nextContigSeq) {
                    readySeq = s;
                    break;
                }
            }
            if (readySeq == null) return;

            byte[] payload = pending.remove(readySeq);
            pendingBytes -= payload.length;

            long overlap = nextContigSeq - readySeq;
            if (overlap >= payload.length) continue;

            int start = (int) overlap;
            buffer.write(payload, start, payload.length - start);
            nextContigSeq += payload.length - overlap;
        }
    }

    private void trimBuffer() {
        if (buffer.size() == 0) return;

        log.warn("DirectionState[{}] buffer exceeded {} bytes, trimming", direction, MAX_BUFFER_SIZE);

        int desired = MAX_BUFFER_SIZE / 2;
        int trim;
        if (parseOffset > 0) {
            trim = Math.min(parseOffset, Math.max(0, buffer.size() - desired));
        } else {
            trim = Math.max(0, buffer.size() - desired);
        }
        if (trim <= 0) return;

        trimFront(trim);
    }

    private void trimFront(int trim) {
        byte[] old = buffer.toByteArray();
        buffer.reset();
        buffer.write(old, trim, old.length - trim);
        streamBase += trim;
        parseOffset = Math.max(0, parseOffset - trim);
        if (baseSeq != null) baseSeq += trim;
    }

    private void truncateBuffer(int newSize) {
        byte[] old = buffer.toByteArray();
        buffer.reset();
        if (newSize > 0 && newSize <= old.length) {
            buffer.write(old, 0, newSize);
        }
    }

    private static String bytesToHex(byte[] data, int maxLen) {
        int len = Math.min(data.length, maxLen);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(String.format("%02x", data[i] & 0xFF));
        }
        if (data.length > maxLen) sb.append("...");
        return sb.toString();
    }

}
