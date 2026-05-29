// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUnsetMusicReq(
    int musicId
) {
    public static ZoneUnsetMusicReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUnsetMusicReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneUnsetMusicReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUnsetMusicReq(
            Pojos.readInt(fields, 1)
        );
    }
}
