package com.roco.sniffer.extractors;

import com.roco.sniffer.*;
import lombok.extern.slf4j.Slf4j;
import Next.pojo.PetData;
import Next.pojo.BattleInitInfo;
import Next.pojo.BattleInsidePetInfo;
import Next.pojo.BattlePetInfo;
import Next.pojo.BattleRoleBaseInfo;
import Next.pojo.BattleRoleInfo;
import Next.pojo.ZoneBattleEnterNotify;

import java.util.List;
import java.util.Set;

/**
 * 0x1316 战斗进入（s2c）。
 */
@Slf4j
public class BattleEnterExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x1316); }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ctx.inBattle(true);
            ZoneBattleEnterNotify notify = ZoneBattleEnterNotify.parseFrom(payload);
            int mode = notify.battleMode();
            int round = notify.round();
            int maxRound = notify.maxRound();
            long battleId = notify.initInfo() != null ? notify.initInfo().battleId() : 0;
            String modeStr = switch (mode) {
                case 1 -> "PVE";
                case 2 -> "PVP";
                default -> "mode=" + mode;
            };
            log.info("[battle] === 战斗进入 === {} 回合:{} 最大回合:{} battle_id={}",
                    modeStr, round, maxRound, battleId);

            // 从战斗初始化信息中缓存 petId → confId，并打印双方队伍
            if (notify.initInfo() != null) {
                BattleInitInfo initInfo = notify.initInfo();
                cachePetIds(initInfo.playerTeam(), ctx);
                cachePetIds(initInfo.enemyTeam(), ctx);

                logTeam("我方", initInfo.playerTeam(), ctx);
                logTeam("敌方", initInfo.enemyTeam(), ctx);
            }
        } catch (Exception e) {
            log.debug("0x1316 parseFrom 失败: {}", e.getMessage());
        }
    }

    private void logTeam(String side, List<BattleRoleInfo> teams, ExtractorContext ctx) {
        for (BattleRoleInfo role : teams) {
            // 玩家信息
            if (role.base() != null) {
                BattleRoleBaseInfo base = role.base();
                String playerName = new String(base.name(), java.nio.charset.StandardCharsets.UTF_8);
                int uin = base.roleUin();
                int playerLevel = base.roleLevel();
                int hp = base.hp();
                int maxHp = base.rawHpMax();
                int pvpScore = base.pvpScore();
                // 缓存玩家名字
                if (uin > 0 && !playerName.isEmpty()) {
                    ctx.playerNameCache().put(uin, playerName);
                }
                StringBuilder info = new StringBuilder();
                info.append(String.format("[battle]   %s 玩家:%s", side, playerName));
                if (playerLevel > 0) info.append(String.format(" Lv.%d", playerLevel));
                if (uin > 0) info.append(String.format(" uin:%d", uin));
                if (hp > 0 || maxHp > 0) info.append(String.format(" HP:%d/%d", hp, maxHp));
                if (pvpScore > 0) info.append(String.format(" PVP:%d", pvpScore));
                log.info(info.toString());
            }
            for (BattlePetInfo pet : role.pets()) {
                int petId = 0;
                String name = null;
                int level = 0;
                int nature = 0;
                if (pet.battleInsidePetInfo() != null) {
                    BattleInsidePetInfo info = pet.battleInsidePetInfo();
                    petId = info.petId();
                    name = new String(info.name(), java.nio.charset.StandardCharsets.UTF_8);
                    // 优先从 battle_common_pet_info 取等级和性格
                    if (pet.battleCommonPetInfo() != null) {
                        level = pet.battleCommonPetInfo().level();
                        nature = pet.battleCommonPetInfo().nature();
                    } else {
                        level = ctx.petLevel(petId);
                    }
                } else if (pet.battleCommonPetInfo() != null) {
                    PetData pd = pet.battleCommonPetInfo();
                    petId = pd.gid();
                    name = new String(pd.name(), java.nio.charset.StandardCharsets.UTF_8);
                    level = pd.level();
                }
                if (petId <= 0) continue;
                if (name.isEmpty()) name = ctx.petName(petId);
                if (name == null) name = "pet#" + petId;
                if (pet.battleInsidePetInfo() != null) {
                    List<Integer> a = pet.battleInsidePetInfo().battleAttr();
                    if (a.size() > 6 && a.get(1) > 0) {
                        String natureName = nature > 0 ? ctx.natureDb().lookup(nature) : null;
                        String natureStr = nature > 0
                                ? " 性格:" + (natureName != null ? natureName : String.valueOf(nature))
                                : "";
                        log.info("[battle]   {} {} Lv.{}{} HP:{} 物攻:{} 魔攻:{} 物防:{} 魔防:{} 速度:{}",
                                side, name, level, natureStr, a.get(1), a.get(2), a.get(3), a.get(4), a.get(5), a.get(6));
                        // 性格修正（万分比，79-84 区域：生命/物攻/魔攻/物防/魔防/速度）
                        StringBuilder mods = new StringBuilder();
                        for (int i = 79; i <= 84 && i < a.size(); i++) {
                            int v = a.get(i);
                            if (v != 0) {
                                if (!mods.isEmpty()) mods.append(", ");
                                String attrName = ctx.attributeDb().lookup(i);
                                String label = attrName != null ? attrName : "#" + i;
                                mods.append(String.format("%s%+.1f%%", label, v / 100.0));
                            }
                        }
                        if (!mods.isEmpty()) {
                            log.info("[battle]     性格修正: {}", mods);
                        }
                    } else {
                        log.info("[battle]   {} {}", side, name);
                    }
                } else {
                    String lvlStr = level > 0 ? " Lv." + level : "";
                    log.info("[battle]   {} {}{}", side, name, lvlStr);
                }
            }
        }
    }

    private void cachePetIds(List<BattleRoleInfo> teams, ExtractorContext ctx) {
        for (BattleRoleInfo role : teams) {
            for (BattlePetInfo pet : role.pets()) {
                if (pet.battleInsidePetInfo() != null) {
                    BattleInsidePetInfo info = pet.battleInsidePetInfo();
                    int petId = info.petId();
                    int confId = info.confId();
                    if (petId > 0 && confId > 0) {
                        ctx.gidToConfId().put((long) petId, confId);
                    }
                    String name = new String(info.name(), java.nio.charset.StandardCharsets.UTF_8);
                    if (!name.isEmpty()) {
                        ctx.petNameCache().put((long) petId, name);
                    }
                }
                if (pet.battleCommonPetInfo() != null) {
                    PetData petData = pet.battleCommonPetInfo();
                    long gid = petData.gid();
                    if (gid > 0 && petData.confId() > 0) {
                        ctx.gidToConfId().put(gid, petData.confId());
                    }
                    String name = new String(petData.name(), java.nio.charset.StandardCharsets.UTF_8);
                    if (!name.isEmpty()) {
                        ctx.petNameCache().put(gid, name);
                    }
                }
            }
        }
    }
}
