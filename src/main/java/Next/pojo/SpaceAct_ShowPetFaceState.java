// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_ShowPetFaceState(
    long actorId,
    boolean show,
    int faceState,
    float progress
) {
    public static SpaceAct_ShowPetFaceState parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ShowPetFaceState(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
    public static SpaceAct_ShowPetFaceState parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ShowPetFaceState(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4)
        );
    }
}
