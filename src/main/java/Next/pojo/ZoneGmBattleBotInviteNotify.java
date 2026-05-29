// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmBattleBotInviteNotify(
    int playerUin,
    long zoneInstId
) {
    public static ZoneGmBattleBotInviteNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmBattleBotInviteNotify(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneGmBattleBotInviteNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmBattleBotInviteNotify(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
