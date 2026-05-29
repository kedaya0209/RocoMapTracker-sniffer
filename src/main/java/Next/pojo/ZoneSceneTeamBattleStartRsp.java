// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleStartRsp(
    RetInfo retInfo
) {
    public static ZoneSceneTeamBattleStartRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleStartRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneTeamBattleStartRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleStartRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
