package com.roco.sniffer.extractors;

import com.roco.sniffer.codec.MessageType;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.SpaceActionCollection;
import Next.pojo.SpaceAct_EnteredCatcher;
import Next.pojo.SpaceAct_LeftCatcher;
import Next.pojo.ZoneScenePlayActsNotify;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;

/**
 * 0x0414 区域变化（s2c）。
 */
@Slf4j
public class AreaEventExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x0414); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneScenePlayActsNotify notify = ZoneScenePlayActsNotify.parseFrom(payload);
            List<SpaceActionCollection> actsList = notify.acts();
            for (SpaceActionCollection act : actsList) {
                SpaceAct_EnteredCatcher entered = act.entertedCatcher();
                if (entered != null) {
                    int afid = entered.areaFuncConfId();
                    if (afid > 0 && afid != ctx.currentAreaFuncId()) {
                        ctx.currentAreaFuncId(afid);
                        String name = ctx.areaFuncDb().lookup(afid);
                        byte[] body = (name != null)
                                ? name.getBytes(StandardCharsets.UTF_8)
                                : ByteBuffer.allocate(4).putInt(afid).array();
                        log.info("[area] RMT 区域变更: {}", name != null ? name : "#" + afid);
                        ctx.enqueue(MessageType.AREA_CHANGE.value(), body);
                    }
                }
                SpaceAct_LeftCatcher left = act.leftCatcher();
                if (left != null) {
                    int afid = left.areaFuncConfId();
                    if (afid > 0) {
                        log.debug("[area] leave func_id={}", afid);
                    }
                }
            }
        } catch (Exception e) {
            log.debug("0x0414 parseFrom 失败: {}", e.getMessage());
        }
    }
}
