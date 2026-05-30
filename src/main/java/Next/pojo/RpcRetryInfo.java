// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RpcRetryInfo(
    long latestReqId,
    long oldestUnrespondedReqId,
    List<RpcRetryReqInfo> unrespondedReqInfos,
    long latestProcessedReqId,
    List<RpcRetryReqProcessInfo> reqProcessInfos,
    long oldestProcessingReqId
) {
    public static RpcRetryInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RpcRetryInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RpcRetryReqInfo::parseFrom).toList(),
            Pojos.readLong(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.RpcRetryReqProcessInfo::parseFrom).toList(),
            Pojos.readLong(fields, 8)
        );
    }
    public static RpcRetryInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RpcRetryInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RpcRetryReqInfo::parseFrom).toList(),
            Pojos.readLong(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.RpcRetryReqProcessInfo::parseFrom).toList(),
            Pojos.readLong(fields, 8)
        );
    }
}
