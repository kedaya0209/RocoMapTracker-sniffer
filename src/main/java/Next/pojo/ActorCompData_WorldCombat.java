// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_WorldCombat(
    ActorWorldCombatInfo actorWorldCombatInfo,
    BossWorldCombatInfo bossWorldCombatInfo,
    AvatarWorldCombatInfo avatarWorldCombatInfo
) {
    public static ActorCompData_WorldCombat parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_WorldCombat(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorWorldCombatInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BossWorldCombatInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AvatarWorldCombatInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ActorCompData_WorldCombat parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_WorldCombat(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorWorldCombatInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BossWorldCombatInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AvatarWorldCombatInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
