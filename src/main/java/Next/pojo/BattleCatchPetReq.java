// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleCatchPetReq(
    int playerId,
    int monsterId,
    int itemId,
    int petGid,
    int flowerCatchVitem
) {
    public static BattleCatchPetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleCatchPetReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static BattleCatchPetReq parseFrom(java.util.List<ProtoField> fields) {
        return new BattleCatchPetReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
