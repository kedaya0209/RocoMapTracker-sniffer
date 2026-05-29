// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillFireBulletReq(
    long npcId,
    WorldCombatSkillFireBulletInfo skillFireBulletInfo
) {
    public static ZoneSceneWorldCombatSkillFireBulletReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillFireBulletReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillFireBulletInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatSkillFireBulletReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillFireBulletReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillFireBulletInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
