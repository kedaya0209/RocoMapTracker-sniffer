// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record UnlockedFurniture(
    int furnitureId,
    int unlockTimestamp
) {
    public static UnlockedFurniture parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new UnlockedFurniture(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static UnlockedFurniture parseFrom(java.util.List<ProtoField> fields) {
        return new UnlockedFurniture(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
