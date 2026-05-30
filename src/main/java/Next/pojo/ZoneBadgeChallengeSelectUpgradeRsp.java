// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBadgeChallengeSelectUpgradeRsp(
    RetInfo retInfo,
    List<Integer> upgradeIds
) {
    public static ZoneBadgeChallengeSelectUpgradeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBadgeChallengeSelectUpgradeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneBadgeChallengeSelectUpgradeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBadgeChallengeSelectUpgradeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2)
        );
    }
}
