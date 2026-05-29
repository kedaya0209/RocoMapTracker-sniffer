// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record KeyValueList(
    List<KeyValueItem> kvlist
) {
    public static KeyValueList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new KeyValueList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.KeyValueItem::parseFrom).toList()
        );
    }
    public static KeyValueList parseFrom(java.util.List<ProtoField> fields) {
        return new KeyValueList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.KeyValueItem::parseFrom).toList()
        );
    }
}
