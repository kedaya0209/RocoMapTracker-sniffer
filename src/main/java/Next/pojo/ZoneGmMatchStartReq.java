// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmMatchStartReq(
    int pvpId
) {
    public static ZoneGmMatchStartReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmMatchStartReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmMatchStartReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmMatchStartReq(
            Pojos.readInt(fields, 1)
        );
    }
}
