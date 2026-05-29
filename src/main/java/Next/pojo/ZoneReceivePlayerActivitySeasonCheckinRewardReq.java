// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivitySeasonCheckinRewardReq(
    int activityId,
    int activityRewardIndex,
    List<Integer> activityRewardIndexs
) {
    public static ZoneReceivePlayerActivitySeasonCheckinRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivitySeasonCheckinRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneReceivePlayerActivitySeasonCheckinRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivitySeasonCheckinRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
