// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeastJoinVisitReq(
    boolean agree,
    Position pos
) {
    public static ZoneSceneBeastJoinVisitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeastJoinVisitReq(
            Pojos.readBool(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneBeastJoinVisitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeastJoinVisitReq(
            Pojos.readBool(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
