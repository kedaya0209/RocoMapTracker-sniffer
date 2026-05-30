// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendGetFriendListRsp(
    RetInfo retInfo,
    List<FriendRoleInfo> friendRoleList,
    int packIndex,
    boolean isEnd,
    List<FriendRoleInfo> recommendPlayerList,
    int refreshGap,
    int friendType,
    int scene,
    List<Integer> uinList,
    int furnitureId,
    int clientData1,
    int clientData2,
    int clientData3,
    int clientData4
) {
    public static ZoneFriendGetFriendListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendGetFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11, 0),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17)
        );
    }
    public static ZoneFriendGetFriendListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendGetFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.FriendRoleInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11, 0),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17)
        );
    }
}
