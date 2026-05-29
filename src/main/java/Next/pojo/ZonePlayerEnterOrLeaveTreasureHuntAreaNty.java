// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerEnterOrLeaveTreasureHuntAreaNty(
    int activityId,
    int activitySubId,
    boolean isEnter
) {
    public static ZonePlayerEnterOrLeaveTreasureHuntAreaNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerEnterOrLeaveTreasureHuntAreaNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZonePlayerEnterOrLeaveTreasureHuntAreaNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerEnterOrLeaveTreasureHuntAreaNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
