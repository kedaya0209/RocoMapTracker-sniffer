// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetTeamShareAutoCompleteTeamReq(
    int teamType,
    SharedPetTeamInfo sharedTeam,
    AdjustedPetTeamInfo currentTeam
) {
    public static ZonePetTeamShareAutoCompleteTeamReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamShareAutoCompleteTeamReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AdjustedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZonePetTeamShareAutoCompleteTeamReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamShareAutoCompleteTeamReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AdjustedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
