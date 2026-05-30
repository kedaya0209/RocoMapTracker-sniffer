// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetApplySharedPetTeamReq(
    String id,
    int teamType,
    SharedPetTeamInfo sharedTeam
) {
    public static ZonePetApplySharedPetTeamReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetApplySharedPetTeamReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZonePetApplySharedPetTeamReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetApplySharedPetTeamReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
