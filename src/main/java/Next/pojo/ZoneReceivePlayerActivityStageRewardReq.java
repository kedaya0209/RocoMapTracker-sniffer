// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivityStageRewardReq(
    int activityId,
    int activityStageId,
    List<Integer> stageIndex
) {
    public static ZoneReceivePlayerActivityStageRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivityStageRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static ZoneReceivePlayerActivityStageRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivityStageRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
