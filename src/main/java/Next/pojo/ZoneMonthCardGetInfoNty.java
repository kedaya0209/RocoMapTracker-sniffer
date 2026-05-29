// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMonthCardGetInfoNty(
    MonthCardData monthData
) {
    public static ZoneMonthCardGetInfoNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMonthCardGetInfoNty(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MonthCardData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneMonthCardGetInfoNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMonthCardGetInfoNty(
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MonthCardData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
