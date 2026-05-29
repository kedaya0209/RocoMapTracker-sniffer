// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CombineInteractPetInfo(
    int petGid,
    long petObjId
) {
    public static CombineInteractPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CombineInteractPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static CombineInteractPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CombineInteractPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
