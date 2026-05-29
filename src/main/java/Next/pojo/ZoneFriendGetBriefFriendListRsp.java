// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendGetBriefFriendListRsp(
    RetInfo retInfo,
    List<Integer> friendUinList,
    List<ZoneFriendGetBriefFriendListRsp_BriefFriendInfo> friendList
) {
    public static ZoneFriendGetBriefFriendListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendGetBriefFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneFriendGetBriefFriendListRsp_BriefFriendInfo::parseFrom).toList()
        );
    }
    public static ZoneFriendGetBriefFriendListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendGetBriefFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneFriendGetBriefFriendListRsp_BriefFriendInfo::parseFrom).toList()
        );
    }
}
