// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneAddPlayerActivityPartRewardReq(
    int activityId,
    int activityPartId
) {
    public static ZoneAddPlayerActivityPartRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneAddPlayerActivityPartRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneAddPlayerActivityPartRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneAddPlayerActivityPartRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
