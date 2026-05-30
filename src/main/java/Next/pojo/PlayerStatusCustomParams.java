// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerStatusCustomParams(
    PlayerRideStatusParams rideParam,
    PlayerThrowAimStatusParams throwAimParam,
    PlayerTransformStatusParams transformParam,
    PlayerRideSkillStatusParams rideSkillParam,
    PlayerRolePlayStatusParams rolePlayParam,
    PlayerFashionSuitsStatusParams fashionSuitsParam,
    PlayerInteractStatusParams playerInteractParam,
    PlayerPerceptionParams perceptionParam
) {
    public static PlayerStatusCustomParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerStatusCustomParams(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerRideStatusParams.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerThrowAimStatusParams.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerTransformStatusParams.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerRideSkillStatusParams.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerRolePlayStatusParams.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerFashionSuitsStatusParams.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerInteractStatusParams.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerPerceptionParams.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
    public static PlayerStatusCustomParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerStatusCustomParams(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerRideStatusParams.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerThrowAimStatusParams.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerTransformStatusParams.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerRideSkillStatusParams.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerRolePlayStatusParams.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerFashionSuitsStatusParams.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerInteractStatusParams.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerPerceptionParams.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
}
