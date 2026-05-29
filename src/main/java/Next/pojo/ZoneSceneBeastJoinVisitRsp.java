// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeastJoinVisitRsp(
    RetInfo retInfo,
    boolean agree
) {
    public static ZoneSceneBeastJoinVisitRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeastJoinVisitRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneBeastJoinVisitRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeastJoinVisitRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
}
