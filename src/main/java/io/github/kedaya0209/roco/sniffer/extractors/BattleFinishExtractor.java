package io.github.kedaya0209.roco.sniffer.extractors;

import lombok.extern.slf4j.Slf4j;
import Next.pojo.CliSimpleBattlePet;
import Next.pojo.ZoneBattleFinishNotify;
import Next.pojo.BattleFinishPetInfo;
import Next.pojo.BattleSettleInfo;
import Next.pojo.RetInfo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 0x132C 战斗结束（s2c）。
 */
@Slf4j
public class BattleFinishExtractor implements EventExtractor {

    @Override
    public Set<Integer> supportedOpcodes() { return Set.of(0x132C); }

    private static final Map<Integer, String> BATTLE_RESULT_MAP = Map.ofEntries(
            Map.entry(0, "NULL"),
            Map.entry(2, "胜利"),
            Map.entry(4, "失败"),
            Map.entry(10, "精灵逃跑"),
            Map.entry(12, "逃跑"),
            Map.entry(18, "胜利击败"),
            Map.entry(34, "胜利捕获"),
            Map.entry(66, "胜利HP"),
            Map.entry(68, "失败HP"),
            Map.entry(132, "精灵逃脱"),
            Map.entry(260, "逃跑_魔法"),
            Map.entry(516, "精灵逃脱2")
    );

    private static String battleResultName(int resultCode) {
        return BATTLE_RESULT_MAP.getOrDefault(resultCode, "未知(" + resultCode + ")");
    }

    @Override
    public void handle(int opcode, byte[] payload, ExtractorContext ctx) {
        try {
            ctx.inBattle(false);
            ZoneBattleFinishNotify notify = ZoneBattleFinishNotify.parseFrom(payload);
            String resultName = "未知";
            long rounds = 0, seconds = 0, battleId = 0;
            boolean surrender = false;

            if (notify.settleInfo() != null) {
                BattleSettleInfo settle = notify.settleInfo();
                int resultCode = settle.result();
                resultName = battleResultName(resultCode);
                rounds = settle.rounds();
                seconds = settle.seconds();
                battleId = settle.battleId();
                surrender = settle.isSurrender();
            }

            StringBuilder sb = new StringBuilder();
            sb.append("[battle] === 战斗结束 === ").append(resultName);
            if (rounds > 0) sb.append(" (回合:").append(rounds);
            if (seconds > 0) sb.append(" 耗时:").append(seconds).append("s");
            if (rounds > 0) sb.append(")");
            if (surrender) sb.append(" [投降]");
            sb.append(" battle_id=").append(battleId);
            log.info(sb.toString());

            // 缓存精灵 ID 映射
            for (CliSimpleBattlePet sp : notify.simplePets()) {
                int petId = sp.petId();
                int confId = sp.petConfId();
                if (petId > 0 && confId > 0) {
                    ctx.gidToConfId().put((long) petId, confId);
                }
                String name = sp.name();
                if (!name.isEmpty()) {
                    ctx.petNameCache().put((long) petId, name);
                }
            }

            // 从 ret_info.goods_change_info 缓存 PetData
            if (notify.retInfo() != null) {
                RetInfo retInfo = notify.retInfo();
                if (retInfo.goodsChangeInfo() != null) {
                    ctx.cachePetDataFromChanges(retInfo.goodsChangeInfo().changes());
                }
            }

            List<BattleFinishPetInfo> petInfoList = notify.petInfo();
            for (BattleFinishPetInfo pet : petInfoList) {
                long gid = pet.petGid();
                String name = ctx.petName(gid);
                String label = (name != null) ? name : "gid=" + gid;
                log.info("[battle]   {} HP={}/{} 能量={}",
                        label, pet.remainHp(), pet.battleMaxHp(), pet.remainEnergy());
            }
        } catch (Exception e) {
            log.debug("0x132C parseFrom 失败: {}", e.getMessage());
        }
    }
}
