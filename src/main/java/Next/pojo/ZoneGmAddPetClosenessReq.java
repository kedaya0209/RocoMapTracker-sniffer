// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmAddPetClosenessReq(
    int petGid,
    int addExp
) {
    public static ZoneGmAddPetClosenessReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmAddPetClosenessReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGmAddPetClosenessReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmAddPetClosenessReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
