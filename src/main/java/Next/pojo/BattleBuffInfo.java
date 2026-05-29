// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleBuffInfo(
    int casterId,
    int buffId,
    int appendRound,
    int stack,
    int castMoment,
    int buffType,
    List<Integer> lastStackChangeRound,
    int downRound,
    int upRound,
    int actCount,
    int lastTriggerRound,
    int realTriggerRound,
    boolean isFromGlueSkill,
    int fromSkillId,
    List<Integer> buffData,
    List<Long> appendHistory,
    List<BattleCarryonBuffInfo> carryonInfo,
    List<Integer> descParam1,
    List<Integer> descParam2,
    List<Integer> groupSign,
    int eventMark,
    int lastStackAppendRound,
    int skillCount,
    boolean isHidden,
    int hiddenStack,
    int pos,
    BuffRunningData data,
    boolean delFlag,
    int buffOnFieldRound,
    int buffLeftRound,
    int lastChangeBuffLeftRound,
    boolean virtualCaster
) {
    public static BattleBuffInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBuffInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readIntList(fields, 16),
            Pojos.readLongList(fields, 18),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.BattleCarryonBuffInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 20),
            Pojos.readIntList(fields, 21),
            Pojos.readIntList(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 25),
            Pojos.readBool(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readInt(fields, 28),
            Pojos.readMessage(fields, 29) != null ? Next.pojo.BuffRunningData.parseFrom(Pojos.readMessage(fields, 29)) : null,
            Pojos.readBool(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readBool(fields, 34)
        );
    }
    public static BattleBuffInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBuffInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readIntList(fields, 16),
            Pojos.readLongList(fields, 18),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.BattleCarryonBuffInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 20),
            Pojos.readIntList(fields, 21),
            Pojos.readIntList(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 25),
            Pojos.readBool(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readInt(fields, 28),
            Pojos.readMessage(fields, 29) != null ? Next.pojo.BuffRunningData.parseFrom(Pojos.readMessage(fields, 29)) : null,
            Pojos.readBool(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readBool(fields, 34)
        );
    }
}
