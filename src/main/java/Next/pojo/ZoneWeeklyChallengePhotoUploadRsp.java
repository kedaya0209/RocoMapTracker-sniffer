// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWeeklyChallengePhotoUploadRsp(
    RetInfo retInfo,
    PlayerActivityInfo_ActivityWeeklyChallengeTeam teamPhoto
) {
    public static ZoneWeeklyChallengePhotoUploadRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWeeklyChallengePhotoUploadRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneWeeklyChallengePhotoUploadRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWeeklyChallengePhotoUploadRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
