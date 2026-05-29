// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUpgradePlayerCardSkinRsp(
    RetInfo retInfo,
    PlayerCardBriefInfo cardBriefInfo,
    int skinId
) {
    public static ZoneUpgradePlayerCardSkinRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpgradePlayerCardSkinRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneUpgradePlayerCardSkinRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpgradePlayerCardSkinRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
