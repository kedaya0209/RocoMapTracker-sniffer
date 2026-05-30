// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChoosePetPartnerReq(
    int petBaseId,
    boolean isInherit,
    boolean commit,
    boolean miantainExpression,
    int activityId
) {
    public static ZoneChoosePetPartnerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChoosePetPartnerReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneChoosePetPartnerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChoosePetPartnerReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
