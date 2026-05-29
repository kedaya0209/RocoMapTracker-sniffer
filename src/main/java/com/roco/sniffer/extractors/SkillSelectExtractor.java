package com.roco.sniffer.extractors;

import com.roco.sniffer.*;
import com.roco.sniffer.data.ConfigDb;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.BattleCastSkillReq;
import Next.pojo.BattleRoundFlowReq;
import java.util.Set;
import Next.pojo.ZoneBattleCmdPushbackReq;

/**
 * 0x130B 选技能（c2s）。
 */
@Slf4j
public class SkillSelectExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x130B); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ZoneBattleCmdPushbackReq req = ZoneBattleCmdPushbackReq.parseFrom(payload);
            if (req.req().isEmpty()) return;
            BattleRoundFlowReq flow = req.req().get(0);
            if (flow.castSkill() != null) {
                BattleCastSkillReq cast = flow.castSkill();
                String skillName = ctx.skillDb().lookup(cast.skillId());
                String skillLabel = (skillName != null) ? skillName : "skill_id=" + cast.skillId();
                log.info("[battle] 选技能 {} {} → {}",
                        ctx.petLabel(cast.casterPetId()), skillLabel, ctx.petLabel(cast.targetPetId()));
            } else if (flow.changePet() != null) {
                log.info("[battle] {} 换宠", ctx.petLabel(flow.changePet().battlePetId()));
            } else {
                log.info("[battle] 选技能 req_type={}", req.reqType());
            }
        } catch (Exception e) {
            log.debug("0x130B parseFrom 失败: {}", e.getMessage());
        }
    }
}
