// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerTypeGiftLimitList(
    List<PlayerTypeGiftLimitItem> items
) {
    public static PlayerTypeGiftLimitList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTypeGiftLimitList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerTypeGiftLimitItem::parseFrom).toList()
        );
    }
    public static PlayerTypeGiftLimitList parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTypeGiftLimitList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerTypeGiftLimitItem::parseFrom).toList()
        );
    }
}
