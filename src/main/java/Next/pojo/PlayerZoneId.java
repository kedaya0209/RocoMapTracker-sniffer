// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerZoneId(
    int uin,
    long zoneInstId,
    int npcId
) {
    public static PlayerZoneId parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerZoneId(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerZoneId parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerZoneId(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
