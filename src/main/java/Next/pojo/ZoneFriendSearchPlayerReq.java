// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendSearchPlayerReq(
    int uin
) {
    public static ZoneFriendSearchPlayerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendSearchPlayerReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneFriendSearchPlayerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendSearchPlayerReq(
            Pojos.readInt(fields, 1)
        );
    }
}
