// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmGetPlayerBriefInfoReq(
    int uin
) {
    public static ZoneGmGetPlayerBriefInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmGetPlayerBriefInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmGetPlayerBriefInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmGetPlayerBriefInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
