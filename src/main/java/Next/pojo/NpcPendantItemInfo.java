// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NpcPendantItemInfo(
    int id,
    boolean enabled,
    Point point,
    int status
) {
    public static NpcPendantItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcPendantItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
    public static NpcPendantItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NpcPendantItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
}
