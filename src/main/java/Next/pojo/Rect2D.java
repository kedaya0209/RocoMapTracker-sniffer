// Generated from com_base_types.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record Rect2D(
    Position2D beg,
    Position2D size
) {
    public static Rect2D parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Rect2D(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position2D.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position2D.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static Rect2D parseFrom(java.util.List<ProtoField> fields) {
        return new Rect2D(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position2D.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position2D.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
