// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTlogReportReq(
    String tlogTag,
    String tlogContent
) {
    public static ZoneTlogReportReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTlogReportReq(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ZoneTlogReportReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTlogReportReq(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
