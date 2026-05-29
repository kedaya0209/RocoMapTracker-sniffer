// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_ThrowedPet(
    int gid,
    long npcId
) {
    public static ActorInfo_ThrowedPet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_ThrowedPet(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ActorInfo_ThrowedPet parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_ThrowedPet(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
