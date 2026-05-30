// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClientQueryTaskStateReq(
    int taskId
) {
    public static ZoneGmClientQueryTaskStateReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClientQueryTaskStateReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmClientQueryTaskStateReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClientQueryTaskStateReq(
            Pojos.readInt(fields, 1)
        );
    }
}
