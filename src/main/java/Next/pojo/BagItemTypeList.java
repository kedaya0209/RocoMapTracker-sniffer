// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BagItemTypeList(
    int type,
    List<BagItem> items,
    int sortType,
    long totalNum,
    long totalNumLastUpdateTime
) {
    public static BagItemTypeList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BagItemTypeList(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BagItem::parseFrom).toList(),
            Pojos.readInt(fields, 3, 0),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static BagItemTypeList parseFrom(java.util.List<ProtoField> fields) {
        return new BagItemTypeList(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BagItem::parseFrom).toList(),
            Pojos.readInt(fields, 3, 0),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
