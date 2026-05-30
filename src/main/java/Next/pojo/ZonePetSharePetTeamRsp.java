// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetSharePetTeamRsp(
    RetInfo retInfo,
    String id,
    SharedPetTeamInfo team
) {
    public static ZonePetSharePetTeamRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetSharePetTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZonePetSharePetTeamRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetSharePetTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
