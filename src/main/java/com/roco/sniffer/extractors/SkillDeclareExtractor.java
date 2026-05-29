package com.roco.sniffer.extractors;

import com.roco.sniffer.*;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.BattleCastSkillReq;
import Next.pojo.BattleRoundFlowReq;
import java.util.Set;
import Next.pojo.ZoneBattleCmdSyncNotify;

/**
 * 0x1322 技能广播（s2c）。
 */
@Slf4j
public class SkillDeclareExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x1322); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneBattleCmdSyncNotify notify = ZoneBattleCmdSyncNotify.parseFrom(payload);
            int playerUin = notify.playerUin();
            String playerName = ctx.playerName(playerUin);
            String playerLabel = (playerName != null) ? playerName : "uin=" + playerUin;
            if (notify.req() != null) {
                BattleRoundFlowReq flow = notify.req();
                if (flow.castSkill() != null) {
                    BattleCastSkillReq cast = flow.castSkill();
                    String skillName = ctx.skillDb().lookup(cast.skillId());
                    String skillLabel = (skillName != null) ? skillName : "skill_id=" + cast.skillId();
                    log.info("[battle] {} 声明技能 {} {} → {}",
                            playerLabel, ctx.petLabel(cast.casterPetId()), skillLabel, ctx.petLabel(cast.targetPetId()));
                } else if (flow.changePet() != null) {
                    log.info("[battle] {} {} 换宠", playerLabel, ctx.petLabel(flow.changePet().battlePetId()));
                } else {
                    log.info("[battle] {} 技能广播", playerLabel);
                }
            } else {
                log.info("[battle] {} 技能广播", playerLabel);
            }
        } catch (Exception e) {
            log.debug("0x1322 parseFrom 失败: {}", e.getMessage());
        }
    }
}
