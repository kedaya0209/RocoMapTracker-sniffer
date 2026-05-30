// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetInviteUserListReq(
    int activityId
) {
    public static ZoneGetInviteUserListReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetInviteUserListReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetInviteUserListReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetInviteUserListReq(
            Pojos.readInt(fields, 1)
        );
    }
}
