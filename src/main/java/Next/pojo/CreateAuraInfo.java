// Generated from com_actor.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CreateAuraInfo(
    int confId,
    Point pt,
    long createActorId
) {
    public static CreateAuraInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreateAuraInfo(
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12)
        );
    }
    public static CreateAuraInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CreateAuraInfo(
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readLong(fields, 12)
        );
    }
}
