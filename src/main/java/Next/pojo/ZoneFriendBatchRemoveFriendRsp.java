// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendBatchRemoveFriendRsp(
    RetInfo retInfo,
    List<Integer> uinList,
    List<FriendRoleInfo> changeFriendRole
) {
    public static ZoneFriendBatchRemoveFriendRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendBatchRemoveFriendRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList()
        );
    }
    public static ZoneFriendBatchRemoveFriendRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendBatchRemoveFriendRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList()
        );
    }
}
