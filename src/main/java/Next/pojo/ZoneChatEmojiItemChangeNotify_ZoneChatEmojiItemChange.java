// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange(
    int opType,
    PlayerEmojiItem emojiItem
) {
    public static ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerEmojiItem.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerEmojiItem.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
