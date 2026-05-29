// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_CameraFlash(
    long actorId,
    long cameraNpcId
) {
    public static SpaceAct_CameraFlash parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CameraFlash(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static SpaceAct_CameraFlash parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CameraFlash(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
