// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneRoleAttrReq(
    String name,
    int sex,
    int image,
    List<SalonItemWearData> salonItemWearData,
    int fashionItemId,
    int fashionSuitId
) {
    public static ZoneRoleAttrReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRoleAttrReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneRoleAttrReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRoleAttrReq(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SalonItemWearData::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
