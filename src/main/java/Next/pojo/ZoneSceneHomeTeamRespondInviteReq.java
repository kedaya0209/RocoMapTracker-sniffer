// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeTeamRespondInviteReq(
    int teamLeaderId,
    int respondType
) {
    public static ZoneSceneHomeTeamRespondInviteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeTeamRespondInviteReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneSceneHomeTeamRespondInviteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeTeamRespondInviteReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
