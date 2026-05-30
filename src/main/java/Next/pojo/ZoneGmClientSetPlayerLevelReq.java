// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClientSetPlayerLevelReq(
    int level
) {
    public static ZoneGmClientSetPlayerLevelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClientSetPlayerLevelReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmClientSetPlayerLevelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClientSetPlayerLevelReq(
            Pojos.readInt(fields, 1)
        );
    }
}
