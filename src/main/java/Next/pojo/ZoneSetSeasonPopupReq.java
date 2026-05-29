// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetSeasonPopupReq(
    int seasonId
) {
    public static ZoneSetSeasonPopupReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetSeasonPopupReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSetSeasonPopupReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetSeasonPopupReq(
            Pojos.readInt(fields, 1)
        );
    }
}
