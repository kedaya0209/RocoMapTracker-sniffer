// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWeeklyChallengePhotoUploadReq(
    int activityId,
    PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto photoInfo,
    int teamId
) {
    public static ZoneWeeklyChallengePhotoUploadReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWeeklyChallengePhotoUploadReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneWeeklyChallengePhotoUploadReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWeeklyChallengePhotoUploadReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeDataPhoto.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
