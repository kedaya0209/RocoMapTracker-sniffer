// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlePveInfo(
    List<BattleTaskInfo> taskInfos,
    int challengeLevelId,
    int npcId,
    List<BattleAppearanceInfo> appearanceInfo,
    List<Integer> ruleIds,
    int buffId,
    int activityId,
    List<Integer> preLevelIds,
    boolean isUnfinish,
    int round,
    int priorityPetGid,
    int battlerRemainHp,
    int weaknessAttackCount,
    List<Integer> enterBattlePetGids,
    int cheerPoint,
    int cheerPointThisWeek,
    boolean canTakePhoto,
    int guideId
) {
    public static BattlePveInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePveInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleAppearanceInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readIntList(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
    public static BattlePveInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePveInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleAppearanceInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readIntList(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
}
