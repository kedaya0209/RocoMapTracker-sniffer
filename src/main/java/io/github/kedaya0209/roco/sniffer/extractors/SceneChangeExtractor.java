package io.github.kedaya0209.roco.sniffer.extractors;

import io.github.kedaya0209.roco.sniffer.codec.MessageType;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.ZoneSceneMoveReq;

import java.nio.ByteBuffer;
import java.util.Set;

/**
 * 0x0133 场景切换（c2s）。
 */
@Slf4j
public class SceneChangeExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x0133); }

    private static final int MAIN_WORLD_SCENE_ID = 103; // 卡洛西亚大陆

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneSceneMoveReq req = ZoneSceneMoveReq.parseFrom(payload);
            int sceneCfgId = req.sceneCfgId();
            if (sceneCfgId <= 0) return;

            if (sceneCfgId != ctx.currentSceneId()) {
                ctx.currentSceneId(sceneCfgId);
                String sceneName = ctx.sceneNameDb().lookup(sceneCfgId);
                log.info("[scene] 场景切换: {} (cfg_id={})",
                        sceneName != null ? sceneName : "#" + sceneCfgId, sceneCfgId);
                boolean isMain = (sceneCfgId == MAIN_WORLD_SCENE_ID);
                if (isMain && !ctx.inMainWorld()) {
                    ctx.inMainWorld(true);
                    ctx.enqueue(MessageType.START_MATCHING.value(), new byte[0]);
                } else if (!isMain && ctx.inMainWorld()) {
                    ctx.inMainWorld(false);
                    ctx.enqueue(MessageType.STOP_MATCHING.value(), new byte[0]);
                }
                byte[] body = ByteBuffer.allocate(4).putInt(sceneCfgId).array();
                ctx.enqueue(MessageType.SCENE_CHANGE.value(), body);
            }
        } catch (Exception e) {
            log.debug("0x0133 parseFrom 失败: {}", e.getMessage());
        }
    }
}
