// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerSeasonAdvBadgeEffectNotify(
    int badgeLvl,
    int seasonAdvProbAdd,
    int seasonAdvShiningExtraWeight
) {
    public static ZonePlayerSeasonAdvBadgeEffectNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerSeasonAdvBadgeEffectNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZonePlayerSeasonAdvBadgeEffectNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerSeasonAdvBadgeEffectNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
