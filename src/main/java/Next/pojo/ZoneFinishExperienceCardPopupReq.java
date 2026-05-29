// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFinishExperienceCardPopupReq(
    int activityId
) {
    public static ZoneFinishExperienceCardPopupReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFinishExperienceCardPopupReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneFinishExperienceCardPopupReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFinishExperienceCardPopupReq(
            Pojos.readInt(fields, 1)
        );
    }
}
