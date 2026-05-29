// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OnlineVisitReportData(
    int ownerUin,
    List<OnlineVisitorItem> visitors
) {
    public static OnlineVisitReportData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OnlineVisitReportData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OnlineVisitorItem::parseFrom).toList()
        );
    }
    public static OnlineVisitReportData parseFrom(java.util.List<ProtoField> fields) {
        return new OnlineVisitReportData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OnlineVisitorItem::parseFrom).toList()
        );
    }
}
