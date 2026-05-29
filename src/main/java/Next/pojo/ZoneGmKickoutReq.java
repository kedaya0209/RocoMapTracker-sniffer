// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmKickoutReq(
    int uin,
    String openId,
    int kickoutType,
    int kickoutSubType,
    String kickoutTxtId
) {
    public static ZoneGmKickoutReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmKickoutReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readString(fields, 8)
        );
    }
    public static ZoneGmKickoutReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmKickoutReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readString(fields, 8)
        );
    }
}
