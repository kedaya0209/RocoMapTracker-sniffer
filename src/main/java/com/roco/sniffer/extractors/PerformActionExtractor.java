package com.roco.sniffer.extractors;

import com.roco.sniffer.*;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.BattlePerformCmd;
import Next.pojo.BattlePerformInfo;
import Next.pojo.BattleSkillCast;
import Next.pojo.BattleBuffChange;
import Next.pojo.BattleBuffTrigger;
import Next.pojo.BattleDamageInfo;
import Next.pojo.BattleDeadInfo;
import Next.pojo.BattleHealInfo;
import Next.pojo.BattleEnergyInfo;
import Next.pojo.BattleEffectTrigger;
import Next.pojo.BattleReviveInfo;
import Next.pojo.BattleSyncData;
import Next.pojo.BattlePetSyncInfo;
import Next.pojo.BattleChangePet;
import Next.pojo.BattleUseItem;
import Next.pojo.BattleCatchPetInfo;
import Next.pojo.BattlePetEvolution;
import Next.pojo.BattleWeatherChange;
import Next.pojo.BattleSkillAura;
import Next.pojo.BattleRoleSkillCast;
import Next.pojo.BattleComboSkillCast;
import Next.pojo.BattlePetEscape;
import Next.pojo.BattlerEscape;
import Next.pojo.BattleRunawayInfo;
import Next.pojo.BattleCmdFailed;
import Next.pojo.BattleSkillStateInfo;
import Next.pojo.BattleDataUpdate;
import Next.pojo.RetInfo;
import Next.pojo.ZoneBattlePerformStartNotify;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 战斗演出解析（s2c）。
 * 0x1324 行动演出、0x13F3 预演、0x13F4 即时刷新、0x13FC PVP演出。
 */
@Slf4j
public class PerformActionExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x1324, 0x13F3, 0x13F4, 0x13FC); }

    private static final int BPT_SKILL_CAST = 1;
    private static final int BPT_BUFF_CHANGE = 2;
    private static final int BPT_BUFF_TRIGGER = 3;
    private static final int BPT_DAMAGE = 4;
    private static final int BPT_HEAL = 5;
    private static final int BPT_ENERGY = 6;
    private static final int BPT_DEATH = 7;
    private static final int BPT_REVIVE = 8;
    private static final int BPT_EFFECT_TRIGGER = 9;
    private static final int BPT_CHANGE_PET = 13;
    private static final int BPT_USE_ITEM = 19;
    private static final int BPT_CATCH_PET = 23;
    private static final int BPT_SKILL_STATE = 24;
    private static final int BPT_PET_EVOLUTION = 25;
    private static final int BPT_SKILL_AURA = 28;
    private static final int BPT_WEATHER_CHANGE = 29;
    private static final int BPT_ROLE_SKILL_CAST = 37;
    private static final int BPT_COMBO_SKILL_CAST = 38;
    private static final int BPT_PET_ESCAPE = 36;
    private static final int BPT_BATTLER_ESCAPE = 41;
    private static final int BPT_RUNAWAY = 48;
    private static final int BPT_CMD_FAILED = 40;
    private static final int BPT_DATA_UPDATE = 44;

    private static final Map<Integer, String> OPCODE_LABELS = Map.of(
            0x1324, "行动演出",
            0x13F3, "预演",
            0x13F4, "即时刷新",
            0x13FC, "PVP演出"
    );

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        String label = OPCODE_LABELS.getOrDefault(opcode, "演出 0x" + String.format("%04X", opcode));
        try {
            ZoneBattlePerformStartNotify notify = ZoneBattlePerformStartNotify.parseFrom(payload);
            if (notify.retInfo() != null) {
                RetInfo retInfo = notify.retInfo();
                if (retInfo.goodsChangeInfo() != null) {
                    ctx.cachePetDataFromChanges(retInfo.goodsChangeInfo().changes());
                }
            }
            renderPerformCmd(notify.performCmd(), label, ctx);
        } catch (Exception e) {
            log.debug("0x{} parseFrom 失败 (len={}): {}", String.format("%04X", opcode), payload.length, e.getMessage());
        }
    }

    static void renderPerformCmd(BattlePerformCmd cmd, String label, ExtractorContext ctx) {
        if (cmd == null) {
            log.info("[battle] === {} ===", label);
            return;
        }
        List<BattlePerformInfo> entries = cmd.performInfo();
        if (entries.isEmpty()) {
            log.info("[battle] === {} ===", label);
            return;
        }
        log.info("[battle] === {} === ({} 条)", label, entries.size());
        for (BattlePerformInfo e : entries) {
            int type = e.type();
            switch (type) {
                case BPT_SKILL_CAST -> {
                    if (e.skillCast() != null) {
                        BattleSkillCast sc = e.skillCast();
                        String skillName = ctx.skillDb().lookup(sc.skillId());
                        String skillLabel = (skillName != null) ? skillName : "skill_id=" + sc.skillId();
                        log.info("[battle]   {} 使用 {}", ctx.petLabel(sc.casterId()), skillLabel);
                    }
                }
                case BPT_DAMAGE -> {
                    if (e.damageInfo() != null) {
                        BattleDamageInfo d = e.damageInfo();
                        String targetLabel = ctx.petLabel(d.targetId());
                        // 从 syncData 提取伤害数字
                        BattlePetSyncInfo sync = findPetSync(e, d.targetId());
                        if (sync != null && sync.hpChange() != 0) {
                            int dmg = -sync.hpChange();
                            int remainHp = sync.hpResult();
                            String critTag = !d.isCritical().isEmpty() && d.isCritical().get(0) ? " 暴击!" : "";
                            log.info("[battle]   {} → {} 造成 {} 伤害 剩余HP:{}{}",
                                    ctx.petLabel(d.casterId()), targetLabel, dmg, remainHp, critTag);
                        } else {
                            log.info("[battle]   {} → {} 造成伤害", ctx.petLabel(d.casterId()), targetLabel);
                        }
                    }
                }
                case BPT_DEATH -> {
                    if (e.deadInfo() != null) {
                        BattleDeadInfo d = e.deadInfo();
                        log.info("[battle]   {} 被击败 (type={})", ctx.petLabel(d.targetId()), d.deadType());
                    }
                }
                case BPT_HEAL -> {
                    if (e.healInfo() != null) {
                        BattleHealInfo h = e.healInfo();
                        BattlePetSyncInfo sync = findPetSync(e, h.targetId());
                        if (sync != null && sync.hpChange() > 0) {
                            log.info("[battle]   {} → {} 治疗 {} HP 剩余:{}",
                                    ctx.petLabel(h.casterId()), ctx.petLabel(h.targetId()),
                                    sync.hpChange(), sync.hpResult());
                        } else {
                            log.info("[battle]   {} → {} 治疗", ctx.petLabel(h.casterId()), ctx.petLabel(h.targetId()));
                        }
                    }
                }
                case BPT_ENERGY -> {
                    if (e.energyInfo() != null) {
                        BattleEnergyInfo en = e.energyInfo();
                        BattlePetSyncInfo sync = findPetSync(e, en.targetId());
                        if (sync != null && sync.energyChange() != 0) {
                            log.info("[battle]   {} → {} 能量{}{} 剩余:{}",
                                    ctx.petLabel(en.casterId()), ctx.petLabel(en.targetId()),
                                    sync.energyChange() > 0 ? "+" : "", sync.energyChange(), sync.energyResult());
                        } else {
                            log.info("[battle]   {} → {} 能量变化", ctx.petLabel(en.casterId()), ctx.petLabel(en.targetId()));
                        }
                    }
                }
                case BPT_EFFECT_TRIGGER -> {
                    if (e.effectTrigger() != null) {
                        BattleEffectTrigger et = e.effectTrigger();
                        String effectName = ctx.effectDb().lookup(et.effectId());
                        String effectLabel = (effectName != null) ? effectName : "effect_id=" + et.effectId();
                        log.info("[battle]   {} 触发效果 {}", ctx.petLabel(et.casterId()), effectLabel);
                    }
                }
                case BPT_BUFF_CHANGE -> {
                    if (e.buffChange() != null) {
                        BattleBuffChange bc = e.buffChange();
                        String buffName = ctx.buffDb().lookup(bc.buffId());
                        String buffLabel = (buffName != null) ? buffName : "buff_id=" + bc.buffId();
                        if (bc.buffInfo() != null && bc.buffInfo().stack() > 0) {
                            log.info("[battle]   {} buff变化 {} x{}", ctx.petLabel(bc.casterId()), buffLabel, bc.buffInfo().stack());
                        } else {
                            log.info("[battle]   {} buff变化 {}", ctx.petLabel(bc.casterId()), buffLabel);
                        }
                    }
                }
                case BPT_BUFF_TRIGGER -> {
                    if (e.buffTrigger() != null) {
                        BattleBuffTrigger bt = e.buffTrigger();
                        String buffName = ctx.buffDb().lookup(bt.buffId());
                        String buffLabel = (buffName != null) ? buffName : "buff_id=" + bt.buffId();
                        log.info("[battle]   {} 触发buff {}", ctx.petLabel(bt.casterId()), buffLabel);
                    }
                }
                case BPT_REVIVE -> {
                    if (e.reviveInfo() != null) {
                        BattleReviveInfo rv = e.reviveInfo();
                        BattlePetSyncInfo sync = findPetSyncFirst(e);
                        String hpStr = (sync != null && sync.hpResult() > 0) ? " HP:" + sync.hpResult() : "";
                        log.info("[battle]   {} 复活{}", ctx.petLabel(rv.casterId()), hpStr);
                    }
                }
                case BPT_CHANGE_PET -> {
                    if (e.changePet() != null) {
                        BattleChangePet cp = e.changePet();
                        String newPetName = ctx.petLabel(cp.battlePetId());
                        log.info("[battle]   换宠 → {} (player={})", newPetName, cp.playerId());
                    }
                }
                case BPT_USE_ITEM -> {
                    if (e.useItem() != null) {
                        BattleUseItem ui = e.useItem();
                        String itemName = ctx.bagDb().lookup(ui.itemId());
                        String itemLabel = (itemName != null) ? itemName : "item_id=" + ui.itemId();
                        log.info("[battle]   使用 {} x{}", itemLabel, ui.itemNum());
                    }
                }
                case BPT_CATCH_PET -> {
                    if (e.catchPetInfo() != null) {
                        BattleCatchPetInfo ci = e.catchPetInfo();
                        log.info("[battle]   捕捉 monster:{} 概率:{}%{}",
                                ci.monsterId(), ci.catchProb(), ci.success() ? " 成功!" : " 失败");
                    }
                }
                case BPT_PET_EVOLUTION -> {
                    if (e.petEvolution() != null) {
                        BattlePetEvolution pe = e.petEvolution();
                        log.info("[battle]   {} 进化", ctx.petLabel(pe.petId()));
                    }
                }
                case BPT_WEATHER_CHANGE -> {
                    if (e.weatherChange() != null) {
                        BattleWeatherChange wc = e.weatherChange();
                        log.info("[battle]   天气变化 weather_id={}", wc.weatherId());
                    }
                }
                case BPT_SKILL_AURA -> {
                    if (e.skillAura() != null) {
                        BattleSkillAura sa = e.skillAura();
                        String skillName = ctx.skillDb().lookup(sa.skillId());
                        String skillLabel = (skillName != null) ? skillName : "skill_id=" + sa.skillId();
                        log.info("[battle]   技能光环 {}", skillLabel);
                    }
                }
                case BPT_ROLE_SKILL_CAST -> {
                    if (e.roleSkillCast() != null) {
                        BattleRoleSkillCast rsc = e.roleSkillCast();
                        String skillName = ctx.skillDb().lookup(rsc.skillId());
                        String skillLabel = (skillName != null) ? skillName : "skill_id=" + rsc.skillId();
                        log.info("[battle]   玩家使用 {} (uin={})", skillLabel, rsc.casterUin());
                    }
                }
                case BPT_COMBO_SKILL_CAST -> {
                    if (e.comboSkillCast() != null) {
                        BattleComboSkillCast csc = e.comboSkillCast();
                        String skillName = ctx.skillDb().lookup(csc.skillId());
                        String skillLabel = (skillName != null) ? skillName : "skill_id=" + csc.skillId();
                        log.info("[battle]   连击技能 {} ({}/{})", skillLabel, csc.comboIndex() + 1, csc.comboCount());
                    }
                }
                case BPT_PET_ESCAPE -> {
                    if (e.petEscape() != null) {
                        BattlePetEscape pe = e.petEscape();
                        log.info("[battle]   {} 逃跑 (type={})", ctx.petLabel(pe.petId()), pe.performType());
                    }
                }
                case BPT_BATTLER_ESCAPE -> {
                    if (e.battlerEscape() != null) {
                        BattlerEscape be = e.battlerEscape();
                        log.info("[battle]   战斗者逃跑 uin={} reason={}", be.uin(), be.reason());
                    }
                }
                case BPT_RUNAWAY -> {
                    if (e.runaway() != null) {
                        BattleRunawayInfo ri = e.runaway();
                        log.info("[battle]   逃跑 uin={} reason={}", ri.playerUin(), ri.reason());
                    }
                }
                case BPT_CMD_FAILED -> {
                    if (e.cmdFailed() != null) {
                        BattleCmdFailed cf = e.cmdFailed();
                        log.info("[battle]   指令失败 uin={} ret={}", cf.uin(), cf.ret());
                    }
                }
                case BPT_SKILL_STATE -> {
                    if (e.skillState() != null) {
                        BattleSkillStateInfo ss = e.skillState();
                        log.info("[battle]   技能状态变化 pet:{} state:{}", ctx.petLabel(ss.casterPetId()), ss.stateCode());
                    }
                }
                case BPT_DATA_UPDATE -> {
                    if (e.dataUpdate() != null) {
                        BattleDataUpdate du = e.dataUpdate();
                        log.info("[battle]   数据更新 uin={}", du.uin());
                    }
                }
                default -> {}
            }
        }
    }

    /** 从 syncData 中查找指定 petId 的同步信息 */
    private static BattlePetSyncInfo findPetSync(BattlePerformInfo e, int petId) {
        if (e.syncData() == null) return null;
        BattleSyncData syncData = e.syncData();
        for (BattlePetSyncInfo info : syncData.petSyncInfo()) {
            if (info.petId() == petId) return info;
        }
        return null;
    }

    /** 从 syncData 中取第一个 petSyncInfo（用于不知道 petId 的场景） */
    private static BattlePetSyncInfo findPetSyncFirst(BattlePerformInfo e) {
        if (e.syncData() == null) return null;
        List<BattlePetSyncInfo> list = e.syncData().petSyncInfo();
        return list.isEmpty() ? null : list.get(0);
    }
}
