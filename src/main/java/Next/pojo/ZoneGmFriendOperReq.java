// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmFriendOperReq(
    int uin,
    int type,
    String namePrefix,
    int num
) {
    public static ZoneGmFriendOperReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmFriendOperReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneGmFriendOperReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmFriendOperReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
