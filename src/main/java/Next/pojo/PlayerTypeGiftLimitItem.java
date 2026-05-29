// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerTypeGiftLimitItem(
    List<PlayerGiftLimitItem> items,
    int type
) {
    public static PlayerTypeGiftLimitItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTypeGiftLimitItem(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerGiftLimitItem::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerTypeGiftLimitItem parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTypeGiftLimitItem(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerGiftLimitItem::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
