// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillSpawnNpcReq(
    long npcId,
    WorldCombatSkillSpawnNpcInfo skillSpawnNpcInfo
) {
    public static ZoneSceneWorldCombatSkillSpawnNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillSpawnNpcReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillSpawnNpcInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatSkillSpawnNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillSpawnNpcReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillSpawnNpcInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
