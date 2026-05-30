// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleRoleSimpleInfo(
    int petNum,
    int deadPetNum,
    int stateBit,
    int randomPetNum,
    int deadRandomPetNum,
    int defeatPoint,
    boolean freeCatch
) {
    public static BattleRoleSimpleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleSimpleInfo(
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readBool(fields, 15)
        );
    }
    public static BattleRoleSimpleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleSimpleInfo(
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readBool(fields, 15)
        );
    }
}
