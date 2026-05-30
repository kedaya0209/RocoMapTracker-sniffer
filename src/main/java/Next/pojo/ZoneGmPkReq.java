// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmPkReq(
    int uin
) {
    public static ZoneGmPkReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmPkReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmPkReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmPkReq(
            Pojos.readInt(fields, 1)
        );
    }
}
