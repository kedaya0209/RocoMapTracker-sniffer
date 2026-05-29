// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LegendFirstWinAloneInfo(
    int winTime,
    int battleConfId
) {
    public static LegendFirstWinAloneInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LegendFirstWinAloneInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static LegendFirstWinAloneInfo parseFrom(java.util.List<ProtoField> fields) {
        return new LegendFirstWinAloneInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
