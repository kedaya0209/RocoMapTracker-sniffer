// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWeeklyChallengeUpdatePhotoReq(
    int activityId,
    int teamId
) {
    public static ZoneWeeklyChallengeUpdatePhotoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWeeklyChallengeUpdatePhotoReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneWeeklyChallengeUpdatePhotoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWeeklyChallengeUpdatePhotoReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
