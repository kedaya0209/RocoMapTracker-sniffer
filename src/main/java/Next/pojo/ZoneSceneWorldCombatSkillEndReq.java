// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillEndReq(
    long npcId,
    WorldCombatSkillEndInfo skillEndInfo
) {
    public static ZoneSceneWorldCombatSkillEndReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillEndReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillEndInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneWorldCombatSkillEndReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillEndReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatSkillEndInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
