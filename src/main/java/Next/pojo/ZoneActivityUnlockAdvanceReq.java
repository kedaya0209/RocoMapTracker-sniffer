// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneActivityUnlockAdvanceReq(
    int activityId
) {
    public static ZoneActivityUnlockAdvanceReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivityUnlockAdvanceReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneActivityUnlockAdvanceReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivityUnlockAdvanceReq(
            Pojos.readInt(fields, 1)
        );
    }
}
