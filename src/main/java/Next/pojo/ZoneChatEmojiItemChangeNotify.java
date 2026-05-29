// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneChatEmojiItemChangeNotify(
    List<ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange> emojiItemChangeList
) {
    public static ZoneChatEmojiItemChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChatEmojiItemChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange::parseFrom).toList()
        );
    }
    public static ZoneChatEmojiItemChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChatEmojiItemChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneChatEmojiItemChangeNotify_ZoneChatEmojiItemChange::parseFrom).toList()
        );
    }
}
