// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DotsServerAIInfo(
    long actorId,
    Point pt,
    int lodType,
    long ownerId
) {
    public static DotsServerAIInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsServerAIInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static DotsServerAIInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DotsServerAIInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
