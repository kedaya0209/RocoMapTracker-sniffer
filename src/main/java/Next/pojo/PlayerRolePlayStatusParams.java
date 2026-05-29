// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerRolePlayStatusParams(
    int rolePlayId,
    int petId,
    long petServerid,
    int mutationType,
    int nature,
    GlassInfo glassInfo,
    int skillInteractId,
    int skillType,
    boolean isStopLoop
) {
    public static PlayerRolePlayStatusParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerRolePlayStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9, 0),
            Pojos.readBool(fields, 10)
        );
    }
    public static PlayerRolePlayStatusParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerRolePlayStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9, 0),
            Pojos.readBool(fields, 10)
        );
    }
}
