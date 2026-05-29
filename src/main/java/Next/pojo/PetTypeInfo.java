// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetTypeInfo(
    int type,
    int param
) {
    public static PetTypeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTypeInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetTypeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetTypeInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
}
