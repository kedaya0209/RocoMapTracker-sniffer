// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCheckNameReq(
    byte[] name
) {
    public static ZoneCheckNameReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCheckNameReq(
            Pojos.readBytes(fields, 1)
        );
    }
    public static ZoneCheckNameReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCheckNameReq(
            Pojos.readBytes(fields, 1)
        );
    }
}
