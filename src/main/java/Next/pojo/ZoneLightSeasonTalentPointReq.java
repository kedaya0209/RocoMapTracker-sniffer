// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneLightSeasonTalentPointReq(
    int pointId,
    int petGid
) {
    public static ZoneLightSeasonTalentPointReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneLightSeasonTalentPointReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneLightSeasonTalentPointReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneLightSeasonTalentPointReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
