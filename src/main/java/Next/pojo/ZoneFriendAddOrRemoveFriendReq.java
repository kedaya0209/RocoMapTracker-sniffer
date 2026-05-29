// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendAddOrRemoveFriendReq(
    int uin,
    int operType
) {
    public static ZoneFriendAddOrRemoveFriendReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendAddOrRemoveFriendReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneFriendAddOrRemoveFriendReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendAddOrRemoveFriendReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
