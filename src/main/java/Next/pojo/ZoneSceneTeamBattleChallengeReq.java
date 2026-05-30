// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleChallengeReq(
    long npcObjId,
    long npcLogicId,
    int challengeType,
    int battleCfgId,
    boolean cancelCurrentMatch,
    int bloodType
) {
    public static ZoneSceneTeamBattleChallengeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleChallengeReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static ZoneSceneTeamBattleChallengeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleChallengeReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
