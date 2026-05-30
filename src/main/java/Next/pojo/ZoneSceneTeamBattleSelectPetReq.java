// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleSelectPetReq(
    int selectState
) {
    public static ZoneSceneTeamBattleSelectPetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleSelectPetReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneTeamBattleSelectPetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleSelectPetReq(
            Pojos.readInt(fields, 1)
        );
    }
}
