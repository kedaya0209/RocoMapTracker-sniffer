// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmFeedGridPosReq(
    int reserve
) {
    public static ZoneGmFeedGridPosReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmFeedGridPosReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmFeedGridPosReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmFeedGridPosReq(
            Pojos.readInt(fields, 1)
        );
    }
}
