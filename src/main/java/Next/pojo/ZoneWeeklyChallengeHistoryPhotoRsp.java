// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneWeeklyChallengeHistoryPhotoRsp(
    RetInfo retInfo,
    List<PlayerActivityInfo_ActivityWeeklyChallengeTeam> historyPhotos
) {
    public static ZoneWeeklyChallengeHistoryPhotoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWeeklyChallengeHistoryPhotoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam::parseFrom).toList()
        );
    }
    public static ZoneWeeklyChallengeHistoryPhotoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWeeklyChallengeHistoryPhotoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityWeeklyChallengeTeam::parseFrom).toList()
        );
    }
}
