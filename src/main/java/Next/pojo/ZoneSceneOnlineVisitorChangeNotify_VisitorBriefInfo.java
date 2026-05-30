// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo(
    int uin,
    byte[] name,
    int level,
    PlayerCardBriefInfo cardInfo,
    int beastStartMatchTime,
    BeastCatchResult checkResult,
    boolean fighting,
    int catchState,
    int gender,
    int worldLv,
    int pvpRankStar,
    int sceneResCfgId
) {
    public static ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BeastCatchResult.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
    public static ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BeastCatchResult.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
}
