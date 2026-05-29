// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneShareFormNotify(
    List<ShareFormItem> shareFormItem
) {
    public static ZoneShareFormNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneShareFormNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ShareFormItem::parseFrom).toList()
        );
    }
    public static ZoneShareFormNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneShareFormNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ShareFormItem::parseFrom).toList()
        );
    }
}
