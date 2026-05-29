// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetTeamShareAutoCompleteTeamRsp(
    RetInfo retInfo,
    AdjustedPetTeamInfo completedTeam
) {
    public static ZonePetTeamShareAutoCompleteTeamRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamShareAutoCompleteTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AdjustedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZonePetTeamShareAutoCompleteTeamRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamShareAutoCompleteTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AdjustedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
