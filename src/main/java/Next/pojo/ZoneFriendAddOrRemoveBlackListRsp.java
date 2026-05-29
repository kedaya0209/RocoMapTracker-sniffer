// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendAddOrRemoveBlackListRsp(
    RetInfo retInfo,
    BlackListRoleInfo changedBlackInfo,
    int type,
    FriendRoleInfo changeFriendRole
) {
    public static ZoneFriendAddOrRemoveBlackListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendAddOrRemoveBlackListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BlackListRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneFriendAddOrRemoveBlackListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendAddOrRemoveBlackListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BlackListRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FriendRoleInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
