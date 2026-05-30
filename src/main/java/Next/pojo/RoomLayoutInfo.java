// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RoomLayoutInfo(
    List<RoomDetails> rooms
) {
    public static RoomLayoutInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RoomLayoutInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RoomDetails::parseFrom).toList()
        );
    }
    public static RoomLayoutInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RoomLayoutInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RoomDetails::parseFrom).toList()
        );
    }
}
