// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RoomDecorationDetails(
    int configId,
    int itemGid
) {
    public static RoomDecorationDetails parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RoomDecorationDetails(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static RoomDecorationDetails parseFrom(java.util.List<ProtoField> fields) {
        return new RoomDecorationDetails(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
