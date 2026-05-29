// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActivityBriefInfo(
    int activityId,
    String activityName,
    int maintabId,
    int priority
) {
    public static ActivityBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ActivityBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
