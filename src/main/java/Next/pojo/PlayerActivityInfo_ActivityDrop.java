// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityDrop(
    List<PlayerActivityInfo_ActivityDropGroup> methodDropList,
    List<PlayerActivityInfo_ActivityDropOnlineInfo> onlineList
) {
    public static PlayerActivityInfo_ActivityDrop parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityDrop(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerActivityInfo_ActivityDropGroup::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityDropOnlineInfo::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityDrop parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityDrop(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerActivityInfo_ActivityDropGroup::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityDropOnlineInfo::parseFrom).toList()
        );
    }
}
