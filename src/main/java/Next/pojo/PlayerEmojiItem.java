// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerEmojiItem(
    int emojiId,
    boolean isUnlock
) {
    public static PlayerEmojiItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerEmojiItem(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static PlayerEmojiItem parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerEmojiItem(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
