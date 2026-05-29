// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerTeleportData(
    int id,
    int lv
) {
    public static PlayerTeleportData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTeleportData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerTeleportData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTeleportData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
