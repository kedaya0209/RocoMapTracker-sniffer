// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_ScenePet(
    int gid,
    long npcId,
    int interactQuantity,
    int interactQuantityThreshold,
    int interactCount
) {
    public static ActorInfo_ScenePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_ScenePet(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 101),
            Pojos.readInt(fields, 102),
            Pojos.readInt(fields, 103),
            Pojos.readInt(fields, 106)
        );
    }
    public static ActorInfo_ScenePet parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_ScenePet(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 101),
            Pojos.readInt(fields, 102),
            Pojos.readInt(fields, 103),
            Pojos.readInt(fields, 106)
        );
    }
}
