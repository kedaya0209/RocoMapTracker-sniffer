// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendBatchRemoveFriendReq(
    List<Integer> uinList
) {
    public static ZoneFriendBatchRemoveFriendReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendBatchRemoveFriendReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneFriendBatchRemoveFriendReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendBatchRemoveFriendReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
