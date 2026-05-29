// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneActiveHideOrShowContentReq(
    int contentId,
    boolean isShow
) {
    public static ZoneActiveHideOrShowContentReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActiveHideOrShowContentReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneActiveHideOrShowContentReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActiveHideOrShowContentReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
