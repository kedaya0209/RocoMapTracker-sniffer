// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivityPetCatchRewardReq(
    int activityId,
    List<Integer> pointIndex
) {
    public static ZoneReceivePlayerActivityPetCatchRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivityPetCatchRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneReceivePlayerActivityPetCatchRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivityPetCatchRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
