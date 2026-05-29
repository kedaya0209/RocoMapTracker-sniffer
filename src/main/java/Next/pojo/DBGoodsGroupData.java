// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DBGoodsGroupData(
    int groupId,
    int buyNum,
    long lastRefreshTime
) {
    public static DBGoodsGroupData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DBGoodsGroupData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static DBGoodsGroupData parseFrom(java.util.List<ProtoField> fields) {
        return new DBGoodsGroupData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
