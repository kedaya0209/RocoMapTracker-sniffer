// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record VisitorInfo(
    int uin,
    int network,
    Point pos,
    int sceneResId,
    Point mainScenePt,
    long zoneInstId
) {
    public static VisitorInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisitorInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6)
        );
    }
    public static VisitorInfo parseFrom(java.util.List<ProtoField> fields) {
        return new VisitorInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6)
        );
    }
}
