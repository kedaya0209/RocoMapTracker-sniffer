// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmAddTestPlatFriendReq(
    int uin,
    int restfulOp,
    String openidPrefix,
    String ranges
) {
    public static ZoneGmAddTestPlatFriendReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmAddTestPlatFriendReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
    public static ZoneGmAddTestPlatFriendReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmAddTestPlatFriendReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
}
