// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPvpRankWeekTaskRewardReq(
    List<Integer> id
) {
    public static ZoneGetPvpRankWeekTaskRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPvpRankWeekTaskRewardReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneGetPvpRankWeekTaskRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPvpRankWeekTaskRewardReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
