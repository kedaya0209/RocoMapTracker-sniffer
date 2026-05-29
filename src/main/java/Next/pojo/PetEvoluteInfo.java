// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetEvoluteInfo(
    int evoluteTime,
    int beforeBaseConfId,
    int afterBaseConfId
) {
    public static PetEvoluteInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEvoluteInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PetEvoluteInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetEvoluteInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
