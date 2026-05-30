// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerEmojiBagInfo(
    List<PlayerEmojiItem> emojiList
) {
    public static PlayerEmojiBagInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerEmojiBagInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerEmojiItem::parseFrom).toList()
        );
    }
    public static PlayerEmojiBagInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerEmojiBagInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerEmojiItem::parseFrom).toList()
        );
    }
}
