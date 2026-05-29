// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUpgradeSeasonAdventureBadgeRsp(
    RetInfo retInfo,
    SeasonAdventureBadge badgeInfo
) {
    public static ZoneUpgradeSeasonAdventureBadgeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpgradeSeasonAdventureBadgeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneUpgradeSeasonAdventureBadgeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpgradeSeasonAdventureBadgeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SeasonAdventureBadge.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
