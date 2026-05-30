// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBanInfo(
    List<PlayerBanItem> banItems,
    PlayerNpcRefreshBanInfo npcRefreshBanInfo,
    List<PlayerFuncBanItem> funcBanItems
) {
    public static PlayerBanInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBanInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBanItem::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerNpcRefreshBanInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerFuncBanItem::parseFrom).toList()
        );
    }
    public static PlayerBanInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBanInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBanItem::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerNpcRefreshBanInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerFuncBanItem::parseFrom).toList()
        );
    }
}
