// Generated from com_relation.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerFriendInfo(
    List<PlayerFriendPinnedItem> pinnedList
) {
    public static PlayerFriendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerFriendInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerFriendPinnedItem::parseFrom).toList()
        );
    }
    public static PlayerFriendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerFriendInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerFriendPinnedItem::parseFrom).toList()
        );
    }
}
