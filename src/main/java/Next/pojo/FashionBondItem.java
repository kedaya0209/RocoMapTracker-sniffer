// Generated from com_appearance.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FashionBondItem(
    int id,
    long getTime,
    boolean petTreeInteracted,
    int colorSuitState
) {
    public static FashionBondItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FashionBondItem(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 5, 0)
        );
    }
    public static FashionBondItem parseFrom(java.util.List<ProtoField> fields) {
        return new FashionBondItem(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 5, 0)
        );
    }
}
