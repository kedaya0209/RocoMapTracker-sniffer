// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneClientReportNpcForAreaReq(
    List<Long> npcObjId,
    boolean isEnter
) {
    public static ZoneClientReportNpcForAreaReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientReportNpcForAreaReq(
            Pojos.readLongList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneClientReportNpcForAreaReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientReportNpcForAreaReq(
            Pojos.readLongList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
