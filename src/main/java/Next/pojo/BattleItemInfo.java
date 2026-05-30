// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleItemInfo(
    int itemId,
    int itemConfId,
    int gid,
    int num,
    boolean isCharge,
    int remainUseCnt,
    int maxUseCnt,
    int effectValue,
    int effectType,
    int allowUseCnt,
    int itemType,
    boolean isEquipped,
    int usedNum,
    int playerSkillId,
    boolean isTemp,
    int state,
    boolean isPermanent,
    int battleUseTimeMax,
    int battleUseTimeRemain,
    int allowUseCntInbattle
) {
    public static BattleItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 16, 0),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20)
        );
    }
    public static BattleItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 16, 0),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20)
        );
    }
}
