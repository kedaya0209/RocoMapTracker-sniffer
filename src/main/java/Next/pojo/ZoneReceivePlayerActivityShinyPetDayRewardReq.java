// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivityShinyPetDayRewardReq(
    int activityId
) {
    public static ZoneReceivePlayerActivityShinyPetDayRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivityShinyPetDayRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneReceivePlayerActivityShinyPetDayRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivityShinyPetDayRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
