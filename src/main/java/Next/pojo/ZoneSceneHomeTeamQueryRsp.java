// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeTeamQueryRsp(
    RetInfo retInfo,
    HomeTeamInfo teamInfo,
    int teamInitMemberCount
) {
    public static ZoneSceneHomeTeamQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeTeamQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneSceneHomeTeamQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeTeamQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomeTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
