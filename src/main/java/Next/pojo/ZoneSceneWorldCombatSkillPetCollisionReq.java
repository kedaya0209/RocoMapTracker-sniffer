// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillPetCollisionReq(
    long npcId,
    WorldCombatSkillPetCollisionInfo skillPetCollision
) {
    public static ZoneSceneWorldCombatSkillPetCollisionReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillPetCollisionReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillPetCollisionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatSkillPetCollisionReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillPetCollisionReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillPetCollisionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
