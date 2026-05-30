// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPlayerActivityInfoRsp(
    RetInfo retInfo,
    int loginDays,
    List<ActivityBriefInfo> activityBriefInfo,
    PlayerActivityLoginHistory loginHistory
) {
    public static ZoneGetPlayerActivityInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPlayerActivityInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ActivityBriefInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerActivityLoginHistory.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneGetPlayerActivityInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPlayerActivityInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ActivityBriefInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerActivityLoginHistory.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
