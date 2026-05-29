// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetApplySharedPetTeamRsp(
    RetInfo retInfo,
    SharedPetTeamInfo sharedTeam,
    AdjustedPetTeamInfo adjustedTeam
) {
    public static ZonePetApplySharedPetTeamRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetApplySharedPetTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AdjustedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZonePetApplySharedPetTeamRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetApplySharedPetTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.AdjustedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
