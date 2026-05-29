// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneOnlineVisitorChangeNotify(
    List<ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo> visitors,
    boolean beastMatchSuccess,
    boolean beastFullVisitors,
    int beastStar,
    int battleCfgId,
    int changeReason,
    long timestamp,
    int changeVisitorUin
) {
    public static ZoneSceneOnlineVisitorChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneOnlineVisitorChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static ZoneSceneOnlineVisitorChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneOnlineVisitorChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneSceneOnlineVisitorChangeNotify_VisitorBriefInfo::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
