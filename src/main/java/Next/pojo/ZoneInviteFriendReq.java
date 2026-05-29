// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneInviteFriendReq(
    int friendUin
) {
    public static ZoneInviteFriendReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneInviteFriendReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneInviteFriendReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneInviteFriendReq(
            Pojos.readInt(fields, 1)
        );
    }
}
