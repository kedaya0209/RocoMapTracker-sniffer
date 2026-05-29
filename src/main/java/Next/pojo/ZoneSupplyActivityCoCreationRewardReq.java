// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSupplyActivityCoCreationRewardReq(
    int activityId
) {
    public static ZoneSupplyActivityCoCreationRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSupplyActivityCoCreationRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSupplyActivityCoCreationRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSupplyActivityCoCreationRewardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
