// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetHatchStatusReq(
    int eggGid
) {
    public static ZoneGetHatchStatusReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetHatchStatusReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetHatchStatusReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetHatchStatusReq(
            Pojos.readInt(fields, 1)
        );
    }
}
