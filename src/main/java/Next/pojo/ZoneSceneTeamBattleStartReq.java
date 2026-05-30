// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleStartReq(
    long npcObjId,
    long npcLogicId,
    int challengeType
) {
    public static ZoneSceneTeamBattleStartReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleStartReq(
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneSceneTeamBattleStartReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleStartReq(
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
