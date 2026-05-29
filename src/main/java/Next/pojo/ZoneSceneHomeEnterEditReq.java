// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeEnterEditReq(
    boolean isEdit
) {
    public static ZoneSceneHomeEnterEditReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeEnterEditReq(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZoneSceneHomeEnterEditReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeEnterEditReq(
            Pojos.readBool(fields, 1)
        );
    }
}
