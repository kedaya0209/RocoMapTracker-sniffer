// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerGiftLimitList(
    List<PlayerGiftLimitItem> items
) {
    public static PlayerGiftLimitList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerGiftLimitList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerGiftLimitItem::parseFrom).toList()
        );
    }
    public static PlayerGiftLimitList parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerGiftLimitList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerGiftLimitItem::parseFrom).toList()
        );
    }
}
