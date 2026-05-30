// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneStopHatchReq(
    int eggGid
) {
    public static ZoneStopHatchReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStopHatchReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneStopHatchReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStopHatchReq(
            Pojos.readInt(fields, 1)
        );
    }
}
