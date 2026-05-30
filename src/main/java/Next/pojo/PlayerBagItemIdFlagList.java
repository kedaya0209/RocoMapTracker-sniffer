// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBagItemIdFlagList(
    List<PlayerBagItemIdFlagTypeInfo> bagFlagItems
) {
    public static PlayerBagItemIdFlagList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBagItemIdFlagList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBagItemIdFlagTypeInfo::parseFrom).toList()
        );
    }
    public static PlayerBagItemIdFlagList parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBagItemIdFlagList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBagItemIdFlagTypeInfo::parseFrom).toList()
        );
    }
}
