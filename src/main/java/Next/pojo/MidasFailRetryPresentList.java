// Generated from com_recharge.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MidasFailRetryPresentList(
    List<MidasFailRetryPresentInfo> fails,
    int tryLastTime
) {
    public static MidasFailRetryPresentList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasFailRetryPresentList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MidasFailRetryPresentInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static MidasFailRetryPresentList parseFrom(java.util.List<ProtoField> fields) {
        return new MidasFailRetryPresentList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MidasFailRetryPresentInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
