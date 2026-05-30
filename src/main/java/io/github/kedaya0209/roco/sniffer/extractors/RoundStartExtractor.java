package io.github.kedaya0209.roco.sniffer.extractors;

import lombok.extern.slf4j.Slf4j;
import java.util.Set;
import Next.pojo.ZoneBattleRoundStartNotify;

/**
 * 0x131A 回合开始（s2c）。
 */
@Slf4j
public class RoundStartExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x131A); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneBattleRoundStartNotify notify = ZoneBattleRoundStartNotify.parseFrom(payload);
            long round = notify.stateInfo() != null ? notify.stateInfo().round() : 0;
            long battleId = notify.stateInfo() != null ? notify.stateInfo().battleId() : 0;
            log.info("[battle] === 回合 {} === battle_id={}", round, battleId);
        } catch (Exception e) {
            log.debug("0x131A parseFrom 失败: {}", e.getMessage());
        }
    }
}
