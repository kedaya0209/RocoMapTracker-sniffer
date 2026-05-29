// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClientSetWorldLevelReq(
    int level
) {
    public static ZoneGmClientSetWorldLevelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClientSetWorldLevelReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmClientSetWorldLevelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClientSetWorldLevelReq(
            Pojos.readInt(fields, 1)
        );
    }
}
