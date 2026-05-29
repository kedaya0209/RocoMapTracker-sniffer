// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivityPartRewardReq(
    int activityId,
    int activityPartId
) {
    public static ZoneReceivePlayerActivityPartRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivityPartRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneReceivePlayerActivityPartRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivityPartRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
