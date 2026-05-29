// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record KeyValueItem(
    String key,
    String value
) {
    public static KeyValueItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new KeyValueItem(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static KeyValueItem parseFrom(java.util.List<ProtoField> fields) {
        return new KeyValueItem(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
