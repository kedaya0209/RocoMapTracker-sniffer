// Generated from com_relation.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerFriendPinnedItem(
    int uin,
    long pinnedTime
) {
    public static PlayerFriendPinnedItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerFriendPinnedItem(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static PlayerFriendPinnedItem parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerFriendPinnedItem(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
