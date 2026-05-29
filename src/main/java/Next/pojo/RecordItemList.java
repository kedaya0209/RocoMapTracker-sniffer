// Generated from com_base_types.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RecordItemList(
    List<RecordItem> itemList
) {
    public static RecordItemList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecordItemList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RecordItem::parseFrom).toList()
        );
    }
    public static RecordItemList parseFrom(java.util.List<ProtoField> fields) {
        return new RecordItemList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RecordItem::parseFrom).toList()
        );
    }
}
