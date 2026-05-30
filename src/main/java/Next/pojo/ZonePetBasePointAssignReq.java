// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetBasePointAssignReq(
    List<ZonePetBasePointAssignReq_BasePointInfo> basePointInfo,
    int petGid
) {
    public static ZonePetBasePointAssignReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBasePointAssignReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZonePetBasePointAssignReq_BasePointInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZonePetBasePointAssignReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBasePointAssignReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZonePetBasePointAssignReq_BasePointInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
