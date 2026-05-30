// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetRecommendPetTeamReq(
    int activityId
) {
    public static ZoneGetRecommendPetTeamReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetRecommendPetTeamReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetRecommendPetTeamReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetRecommendPetTeamReq(
            Pojos.readInt(fields, 1)
        );
    }
}
