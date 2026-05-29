// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneActivityGetCoCreationEmojReq(
    int activityId
) {
    public static ZoneActivityGetCoCreationEmojReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivityGetCoCreationEmojReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneActivityGetCoCreationEmojReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivityGetCoCreationEmojReq(
            Pojos.readInt(fields, 1)
        );
    }
}
