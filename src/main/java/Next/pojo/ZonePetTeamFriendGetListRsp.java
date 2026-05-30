// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetTeamFriendGetListRsp(
    RetInfo retInfo,
    int totalPage,
    int reqPage,
    int pageNum,
    List<FriendPetTeamInfo> petTeamInfo,
    int teamType,
    String filter
) {
    public static ZonePetTeamFriendGetListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamFriendGetListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.FriendPetTeamInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7)
        );
    }
    public static ZonePetTeamFriendGetListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamFriendGetListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.FriendPetTeamInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7)
        );
    }
}
