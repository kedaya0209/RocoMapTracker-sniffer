// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSecondaryPasswordForceDisableReq(
    int actionType
) {
    public static ZoneSecondaryPasswordForceDisableReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSecondaryPasswordForceDisableReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static ZoneSecondaryPasswordForceDisableReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSecondaryPasswordForceDisableReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
