// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceiveActivityConditionGroupRewardReq(
    int activityId,
    int groupId,
    int conditionId
) {
    public static ZoneReceiveActivityConditionGroupRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceiveActivityConditionGroupRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneReceiveActivityConditionGroupRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceiveActivityConditionGroupRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
