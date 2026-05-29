// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneApplyVisitNotify(
    int level,
    byte[] name,
    int uin,
    int serverTime,
    PlayerCardBriefInfo cardInfo
) {
    public static ZoneSceneApplyVisitNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneApplyVisitNotify(
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ZoneSceneApplyVisitNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneApplyVisitNotify(
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
