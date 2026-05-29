// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSelectMainTeamPetReq(
    int gid
) {
    public static ZoneSelectMainTeamPetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectMainTeamPetReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSelectMainTeamPetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectMainTeamPetReq(
            Pojos.readInt(fields, 1)
        );
    }
}
