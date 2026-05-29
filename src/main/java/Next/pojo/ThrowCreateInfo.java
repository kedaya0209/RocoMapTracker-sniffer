// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowCreateInfo(
    Point createPt,
    boolean needCreatePet
) {
    public static ThrowCreateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowCreateInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
    public static ThrowCreateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowCreateInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
}
