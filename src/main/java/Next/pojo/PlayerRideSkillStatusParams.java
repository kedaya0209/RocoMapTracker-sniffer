// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerRideSkillStatusParams(
    int skillId,
    int skillStage,
    Position targetPos
) {
    public static PlayerRideSkillStatusParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerRideSkillStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static PlayerRideSkillStatusParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerRideSkillStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
