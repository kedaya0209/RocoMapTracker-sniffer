// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetPerceivingReq(
    int gid,
    boolean isBegin
) {
    public static ZonePetPerceivingReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetPerceivingReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZonePetPerceivingReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetPerceivingReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
