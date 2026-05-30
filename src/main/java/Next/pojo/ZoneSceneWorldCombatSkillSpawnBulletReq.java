// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillSpawnBulletReq(
    long npcId,
    WorldCombatSkillSpawnBulletInfo skillSpawnBulletInfo
) {
    public static ZoneSceneWorldCombatSkillSpawnBulletReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillSpawnBulletReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillSpawnBulletInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatSkillSpawnBulletReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillSpawnBulletReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillSpawnBulletInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
