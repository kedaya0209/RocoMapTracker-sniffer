// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BossNpcInfos_BossNpcInfo(
    int npcCfgId,
    int star,
    int blood,
    int battlePetbaseId,
    long npcLogicId,
    long npcObjId,
    int contentCfgId,
    int mutationType,
    int endTimestamp,
    int specFlowerSeedId,
    int activityId,
    int campCfgId,
    Position pos,
    int level,
    int status,
    int nextRefreshTime,
    int worldMapCfgId,
    boolean isCampUnlock,
    List<Integer> seasonBattleRules,
    boolean isWorldBossDefeated,
    List<InnerBattleTask> battleTasks,
    List<FlowerSeedBossData> visitFlowerSeedBossDatas,
    int selectFlowerOwnerId
) {
    public static BossNpcInfos_BossNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BossNpcInfos_BossNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readBool(fields, 19),
            Pojos.readIntList(fields, 20),
            Pojos.readBool(fields, 21),
            Pojos.readMessageList(fields, 22).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readMessageList(fields, 23).stream().map(Next.pojo.FlowerSeedBossData::parseFrom).toList(),
            Pojos.readInt(fields, 24)
        );
    }
    public static BossNpcInfos_BossNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BossNpcInfos_BossNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readBool(fields, 19),
            Pojos.readIntList(fields, 20),
            Pojos.readBool(fields, 21),
            Pojos.readMessageList(fields, 22).stream().map(Next.pojo.InnerBattleTask::parseFrom).toList(),
            Pojos.readMessageList(fields, 23).stream().map(Next.pojo.FlowerSeedBossData::parseFrom).toList(),
            Pojos.readInt(fields, 24)
        );
    }
}
