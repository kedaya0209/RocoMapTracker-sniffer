// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSeasonAdventureBadge(
    int badgeLvl
) {
    public static PlayerSeasonAdventureBadge parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSeasonAdventureBadge(
            Pojos.readInt(fields, 1)
        );
    }
    public static PlayerSeasonAdventureBadge parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSeasonAdventureBadge(
            Pojos.readInt(fields, 1)
        );
    }
}
