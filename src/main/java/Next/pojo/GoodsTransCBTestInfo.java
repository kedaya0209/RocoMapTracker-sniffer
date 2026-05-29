// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GoodsTransCBTestInfo(
    int id,
    int num
) {
    public static GoodsTransCBTestInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsTransCBTestInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static GoodsTransCBTestInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsTransCBTestInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
