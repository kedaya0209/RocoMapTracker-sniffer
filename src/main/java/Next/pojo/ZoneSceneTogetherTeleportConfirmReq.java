// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTogetherTeleportConfirmReq(
    boolean togetherRecover
) {
    public static ZoneSceneTogetherTeleportConfirmReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTogetherTeleportConfirmReq(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZoneSceneTogetherTeleportConfirmReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTogetherTeleportConfirmReq(
            Pojos.readBool(fields, 1)
        );
    }
}
