// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattlePetQueryReq(
    List<Integer> toUin,
    List<Integer> toGid
) {
    public static ZoneSceneTeamBattlePetQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattlePetQueryReq(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneSceneTeamBattlePetQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattlePetQueryReq(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
