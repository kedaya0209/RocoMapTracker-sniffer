// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBagItemIdFlagTypeInfo(
    int type,
    List<PlayerBagItemIdFlagInfo> items
) {
    public static PlayerBagItemIdFlagTypeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBagItemIdFlagTypeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBagItemIdFlagInfo::parseFrom).toList()
        );
    }
    public static PlayerBagItemIdFlagTypeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBagItemIdFlagTypeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBagItemIdFlagInfo::parseFrom).toList()
        );
    }
}
