// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldCombatSkillPosLerpSyncReq(
    long actorId,
    WorldCombatDotsSkillPosLerpSyncInfo info,
    boolean allowWait
) {
    public static ZoneSceneWorldCombatSkillPosLerpSyncReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldCombatSkillPosLerpSyncReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillPosLerpSyncInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneSceneWorldCombatSkillPosLerpSyncReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldCombatSkillPosLerpSyncReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillPosLerpSyncInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
}
