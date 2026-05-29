// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmResetPlayerActivityStageRewardReq(
    int resetType,
    int uin
) {
    public static ZoneGmResetPlayerActivityStageRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmResetPlayerActivityStageRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGmResetPlayerActivityStageRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmResetPlayerActivityStageRewardReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
