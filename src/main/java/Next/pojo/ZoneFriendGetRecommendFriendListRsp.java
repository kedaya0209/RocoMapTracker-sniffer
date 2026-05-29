// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendGetRecommendFriendListRsp(
    RetInfo retInfo,
    List<FriendRoleInfo> recommendPlayerList
) {
    public static ZoneFriendGetRecommendFriendListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendGetRecommendFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList()
        );
    }
    public static ZoneFriendGetRecommendFriendListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendGetRecommendFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList()
        );
    }
}
