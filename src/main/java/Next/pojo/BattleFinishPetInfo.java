// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleFinishPetInfo(
    int petGid,
    int remainHp,
    int remainEnergy,
    int modEnergy,
    int battleMaxHp,
    long uin
) {
    public static BattleFinishPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleFinishPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6)
        );
    }
    public static BattleFinishPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleFinishPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6)
        );
    }
}
