// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCinematicSyncInfo(
    long targetNpcId,
    long cinematicId,
    int syncType
) {
    public static PlayerCinematicSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCinematicSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static PlayerCinematicSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCinematicSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
