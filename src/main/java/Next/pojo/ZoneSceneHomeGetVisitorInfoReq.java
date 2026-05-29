// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeGetVisitorInfoReq(
    int homeOwnerId
) {
    public static ZoneSceneHomeGetVisitorInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeGetVisitorInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneHomeGetVisitorInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeGetVisitorInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
