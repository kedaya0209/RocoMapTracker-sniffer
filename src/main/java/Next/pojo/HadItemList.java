// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HadItemList(
    int type,
    List<HadItemInfo> hadItemInfo
) {
    public static HadItemList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HadItemList(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HadItemInfo::parseFrom).toList()
        );
    }
    public static HadItemList parseFrom(java.util.List<ProtoField> fields) {
        return new HadItemList(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HadItemInfo::parseFrom).toList()
        );
    }
}
