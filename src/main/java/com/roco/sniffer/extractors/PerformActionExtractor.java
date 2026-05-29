package com.roco.sniffer.extractors;

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

    // ── 演出类型常量 ──

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

    // ── 表驱动：演出类型 → 处理器 ──

    @FunctionalInterface
    private interface PerformTypeHandler {
        void handle(BattlePerformInfo info, ExtractorContext ctx);
    }

    private static final Map<Integer, PerformTypeHandler> HANDLERS = Map.ofEntries(
        Map.entry(BPT_SKILL_CAST, (e, ctx) -> {
            if (e.skillCast() == null) return;
            BattleSkillCast sc = e.skillCast();
            String skillLabel = resolveName(ctx.skillDb()::lookup, sc.skillId(), "skill_id=");
            log.info("[battle]   {} 使用 {}", ctx.petLabel(sc.casterId()), skillLabel);
        }),
        Map.entry(BPT_DAMAGE, (e, ctx) -> {
            if (e.damageInfo() == null) return;
            BattleDamageInfo d = e.damageInfo();
            String targetLabel = ctx.petLabel(d.targetId());
            BattlePetSyncInfo sync = findPetSync(e, d.targetId());
            if (sync != null && sync.hpChange() != 0) {
                int dmg = -sync.hpChange();
                String critTag = !d.isCritical().isEmpty() && d.isCritical().get(0) ? " 暴击!" : "";
                log.info("[battle]   {} → {} 造成 {} 伤害 剩余HP:{}{}",
                        ctx.petLabel(d.casterId()), targetLabel, dmg, sync.hpResult(), critTag);
            } else {
                log.info("[battle]   {} → {} 造成伤害", ctx.petLabel(d.casterId()), targetLabel);
            }
        }),
        Map.entry(BPT_DEATH, (e, ctx) -> {
            if (e.deadInfo() == null) return;
            BattleDeadInfo d = e.deadInfo();
            log.info("[battle]   {} 被击败 (type={})", ctx.petLabel(d.targetId()), d.deadType());
        }),
        Map.entry(BPT_HEAL, (e, ctx) -> {
            if (e.healInfo() == null) return;
            BattleHealInfo h = e.healInfo();
            BattlePetSyncInfo sync = findPetSync(e, h.targetId());
            if (sync != null && sync.hpChange() > 0) {
                log.info("[battle]   {} → {} 治疗 {} HP 剩余:{}",
                        ctx.petLabel(h.casterId()), ctx.petLabel(h.targetId()),
                        sync.hpChange(), sync.hpResult());
            } else {
                log.info("[battle]   {} → {} 治疗", ctx.petLabel(h.casterId()), ctx.petLabel(h.targetId()));
            }
        }),
        Map.entry(BPT_ENERGY, (e, ctx) -> {
            if (e.energyInfo() == null) return;
            BattleEnergyInfo en = e.energyInfo();
            BattlePetSyncInfo sync = findPetSync(e, en.targetId());
            if (sync != null && sync.energyChange() != 0) {
                log.info("[battle]   {} → {} 能量{}{} 剩余:{}",
                        ctx.petLabel(en.casterId()), ctx.petLabel(en.targetId()),
                        sync.energyChange() > 0 ? "+" : "", sync.energyChange(), sync.energyResult());
            } else {
                log.info("[battle]   {} → {} 能量变化", ctx.petLabel(en.casterId()), ctx.petLabel(en.targetId()));
            }
        }),
        Map.entry(BPT_EFFECT_TRIGGER, (e, ctx) -> {
            if (e.effectTrigger() == null) return;
            BattleEffectTrigger et = e.effectTrigger();
            String effectLabel = resolveName(ctx.effectDb()::lookup, et.effectId(), "effect_id=");
            log.info("[battle]   {} 触发效果 {}", ctx.petLabel(et.casterId()), effectLabel);
        }),
        Map.entry(BPT_BUFF_CHANGE, (e, ctx) -> {
            if (e.buffChange() == null) return;
            BattleBuffChange bc = e.buffChange();
            String buffLabel = resolveName(ctx.buffDb()::lookup, bc.buffId(), "buff_id=");
            if (bc.buffInfo() != null && bc.buffInfo().stack() > 0) {
                log.info("[battle]   {} buff变化 {} x{}", ctx.petLabel(bc.casterId()), buffLabel, bc.buffInfo().stack());
            } else {
                log.info("[battle]   {} buff变化 {}", ctx.petLabel(bc.casterId()), buffLabel);
            }
        }),
        Map.entry(BPT_BUFF_TRIGGER, (e, ctx) -> {
            if (e.buffTrigger() == null) return;
            BattleBuffTrigger bt = e.buffTrigger();
            String buffLabel = resolveName(ctx.buffDb()::lookup, bt.buffId(), "buff_id=");
            log.info("[battle]   {} 触发buff {}", ctx.petLabel(bt.casterId()), buffLabel);
        }),
        Map.entry(BPT_REVIVE, (e, ctx) -> {
            if (e.reviveInfo() == null) return;
            BattleReviveInfo rv = e.reviveInfo();
            BattlePetSyncInfo sync = findPetSyncFirst(e);
            String hpStr = (sync != null && sync.hpResult() > 0) ? " HP:" + sync.hpResult() : "";
            log.info("[battle]   {} 复活{}", ctx.petLabel(rv.casterId()), hpStr);
        }),
        Map.entry(BPT_CHANGE_PET, (e, ctx) -> {
            if (e.changePet() == null) return;
            BattleChangePet cp = e.changePet();
            log.info("[battle]   换宠 → {} (player={})", ctx.petLabel(cp.battlePetId()), cp.playerId());
        }),
        Map.entry(BPT_USE_ITEM, (e, ctx) -> {
            if (e.useItem() == null) return;
            BattleUseItem ui = e.useItem();
            String itemLabel = resolveName(ctx.bagDb()::lookup, ui.itemId(), "item_id=");
            log.info("[battle]   使用 {} x{}", itemLabel, ui.itemNum());
        }),
        Map.entry(BPT_CATCH_PET, (e, ctx) -> {
            if (e.catchPetInfo() == null) return;
            BattleCatchPetInfo ci = e.catchPetInfo();
            log.info("[battle]   捕捉 monster:{} 概率:{}%{}",
                    ci.monsterId(), ci.catchProb(), ci.success() ? " 成功!" : " 失败");
        }),
        Map.entry(BPT_PET_EVOLUTION, (e, ctx) -> {
            if (e.petEvolution() == null) return;
            log.info("[battle]   {} 进化", ctx.petLabel(e.petEvolution().petId()));
        }),
        Map.entry(BPT_WEATHER_CHANGE, (e, ctx) -> {
            if (e.weatherChange() == null) return;
            log.info("[battle]   天气变化 weather_id={}", e.weatherChange().weatherId());
        }),
        Map.entry(BPT_SKILL_AURA, (e, ctx) -> {
            if (e.skillAura() == null) return;
            String skillLabel = resolveName(ctx.skillDb()::lookup, e.skillAura().skillId(), "skill_id=");
            log.info("[battle]   技能光环 {}", skillLabel);
        }),
        Map.entry(BPT_ROLE_SKILL_CAST, (e, ctx) -> {
            if (e.roleSkillCast() == null) return;
            BattleRoleSkillCast rsc = e.roleSkillCast();
            String skillLabel = resolveName(ctx.skillDb()::lookup, rsc.skillId(), "skill_id=");
            log.info("[battle]   玩家使用 {} (uin={})", skillLabel, rsc.casterUin());
        }),
        Map.entry(BPT_COMBO_SKILL_CAST, (e, ctx) -> {
            if (e.comboSkillCast() == null) return;
            BattleComboSkillCast csc = e.comboSkillCast();
            String skillLabel = resolveName(ctx.skillDb()::lookup, csc.skillId(), "skill_id=");
            log.info("[battle]   连击技能 {} ({}/{})", skillLabel, csc.comboIndex() + 1, csc.comboCount());
        }),
        Map.entry(BPT_PET_ESCAPE, (e, ctx) -> {
            if (e.petEscape() == null) return;
            log.info("[battle]   {} 逃跑 (type={})", ctx.petLabel(e.petEscape().petId()), e.petEscape().performType());
        }),
        Map.entry(BPT_BATTLER_ESCAPE, (e, ctx) -> {
            if (e.battlerEscape() == null) return;
            log.info("[battle]   战斗者逃跑 uin={} reason={}", e.battlerEscape().uin(), e.battlerEscape().reason());
        }),
        Map.entry(BPT_RUNAWAY, (e, ctx) -> {
            if (e.runaway() == null) return;
            log.info("[battle]   逃跑 uin={} reason={}", e.runaway().playerUin(), e.runaway().reason());
        }),
        Map.entry(BPT_CMD_FAILED, (e, ctx) -> {
            if (e.cmdFailed() == null) return;
            log.info("[battle]   指令失败 uin={} ret={}", e.cmdFailed().uin(), e.cmdFailed().ret());
        }),
        Map.entry(BPT_SKILL_STATE, (e, ctx) -> {
            if (e.skillState() == null) return;
            log.info("[battle]   技能状态变化 pet:{} state:{}", ctx.petLabel(e.skillState().casterPetId()), e.skillState().stateCode());
        }),
        Map.entry(BPT_DATA_UPDATE, (e, ctx) -> {
            if (e.dataUpdate() == null) return;
            log.info("[battle]   数据更新 uin={}", e.dataUpdate().uin());
        })
    );

    // ── 入口 ──

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
            PerformTypeHandler handler = HANDLERS.get(e.type());
            if (handler != null) handler.handle(e, ctx);
        }
    }

    // ── 辅助方法 ──

    @FunctionalInterface
    private interface NameLookup {
        String lookup(int id);
    }

    private static String resolveName(NameLookup lookup, int id, String prefix) {
        String name = lookup.lookup(id);
        return (name != null) ? name : prefix + id;
    }

    private static BattlePetSyncInfo findPetSync(BattlePerformInfo e, int petId) {
        if (e.syncData() == null) return null;
        for (BattlePetSyncInfo info : e.syncData().petSyncInfo()) {
            if (info.petId() == petId) return info;
        }
        return null;
    }

    private static BattlePetSyncInfo findPetSyncFirst(BattlePerformInfo e) {
        if (e.syncData() == null) return null;
        List<BattlePetSyncInfo> list = e.syncData().petSyncInfo();
        return list.isEmpty() ? null : list.get(0);
    }
}
