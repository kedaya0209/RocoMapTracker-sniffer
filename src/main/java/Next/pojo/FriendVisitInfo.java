// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FriendVisitInfo(
    int visitorNum
) {
    public static FriendVisitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendVisitInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static FriendVisitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FriendVisitInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
