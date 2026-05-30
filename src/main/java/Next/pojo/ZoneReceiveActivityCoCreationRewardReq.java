// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceiveActivityCoCreationRewardReq(
    int activityId,
    boolean isTaskReward
) {
    public static ZoneReceiveActivityCoCreationRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceiveActivityCoCreationRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneReceiveActivityCoCreationRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceiveActivityCoCreationRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
