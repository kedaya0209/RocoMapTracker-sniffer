// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowBagItemResult(
    boolean isBroken,
    int rollBackConfId,
    int throwPower
) {
    public static ThrowBagItemResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowBagItemResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ThrowBagItemResult parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowBagItemResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
