// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleInfoQueryReq(
    long npcLogicId,
    int querySource
) {
    public static ZoneSceneTeamBattleInfoQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleInfoQueryReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneTeamBattleInfoQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleInfoQueryReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
