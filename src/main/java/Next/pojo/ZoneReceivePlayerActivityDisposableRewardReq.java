// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivityDisposableRewardReq(
    int activityId,
    int activityStageId
) {
    public static ZoneReceivePlayerActivityDisposableRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivityDisposableRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneReceivePlayerActivityDisposableRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivityDisposableRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
