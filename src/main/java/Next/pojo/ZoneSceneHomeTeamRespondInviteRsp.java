// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeTeamRespondInviteRsp(
    RetInfo retInfo,
    HomeTeamInfo teamInfo
) {
    public static ZoneSceneHomeTeamRespondInviteRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeTeamRespondInviteRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneHomeTeamRespondInviteRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeTeamRespondInviteRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
