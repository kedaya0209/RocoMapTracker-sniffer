// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleConfirmInviteReq(
    boolean agree,
    int challengeType
) {
    public static ZoneSceneTeamBattleConfirmInviteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleConfirmInviteReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneTeamBattleConfirmInviteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleConfirmInviteReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
