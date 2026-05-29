// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetSceneInfo(
    long npcId,
    int interactQuantity,
    int interactQuantityThreshold,
    boolean canTrigBondName,
    boolean canTrigBondNone,
    int interactCount
) {
    public static PetSceneInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSceneInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static PetSceneInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetSceneInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
