// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmShowTipsNotify(
    String tipsStr
) {
    public static ZoneGmShowTipsNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmShowTipsNotify(
            Pojos.readString(fields, 1)
        );
    }
    public static ZoneGmShowTipsNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmShowTipsNotify(
            Pojos.readString(fields, 1)
        );
    }
}
