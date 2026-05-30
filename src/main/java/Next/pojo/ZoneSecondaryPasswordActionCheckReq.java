// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSecondaryPasswordActionCheckReq(
    int action
) {
    public static ZoneSecondaryPasswordActionCheckReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSecondaryPasswordActionCheckReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSecondaryPasswordActionCheckReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSecondaryPasswordActionCheckReq(
            Pojos.readInt(fields, 1)
        );
    }
}
