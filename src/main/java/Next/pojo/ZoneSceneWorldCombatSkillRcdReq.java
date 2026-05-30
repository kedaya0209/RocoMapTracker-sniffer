// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillRcdReq(
    long npcId,
    WorldCombatSkillRcdInfo skillRcdInfo
) {
    public static ZoneSceneWorldCombatSkillRcdReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillRcdReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillRcdInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatSkillRcdReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillRcdReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillRcdInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
