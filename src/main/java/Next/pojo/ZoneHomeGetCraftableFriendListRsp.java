// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomeGetCraftableFriendListRsp(
    RetInfo retInfo,
    int totalNum,
    List<HomeCraftableFurnitureFriendInfo> friendList
) {
    public static ZoneHomeGetCraftableFriendListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeGetCraftableFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HomeCraftableFurnitureFriendInfo::parseFrom).toList()
        );
    }
    public static ZoneHomeGetCraftableFriendListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeGetCraftableFriendListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HomeCraftableFurnitureFriendInfo::parseFrom).toList()
        );
    }
}
