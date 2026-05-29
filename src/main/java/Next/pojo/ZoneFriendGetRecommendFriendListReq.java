// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendGetRecommendFriendListReq(
    int count
) {
    public static ZoneFriendGetRecommendFriendListReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendGetRecommendFriendListReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneFriendGetRecommendFriendListReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendGetRecommendFriendListReq(
            Pojos.readInt(fields, 1)
        );
    }
}
