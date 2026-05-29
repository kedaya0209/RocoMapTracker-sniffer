// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleRoleMagicOpReq(
    int targetPetId,
    int targetPetPos,
    int upPetId,
    byte[] name,
    int bossPetbaseId
) {
    public static BattleRoleMagicOpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleMagicOpReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static BattleRoleMagicOpReq parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleMagicOpReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
