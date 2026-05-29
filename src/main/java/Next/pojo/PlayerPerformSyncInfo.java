// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerPerformSyncInfo(
    int performType,
    int idlePerformId,
    int hitType,
    Position hitDirection,
    int idlePerformSkillId
) {
    public static PlayerPerformSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPerformSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
    public static PlayerPerformSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPerformSyncInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
}
