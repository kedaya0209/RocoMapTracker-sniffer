// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBasePointAssignReq_BasePointInfo(
    int attributeType,
    int addNum
) {
    public static ZonePetBasePointAssignReq_BasePointInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBasePointAssignReq_BasePointInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZonePetBasePointAssignReq_BasePointInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBasePointAssignReq_BasePointInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
}
