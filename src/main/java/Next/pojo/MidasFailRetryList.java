// Generated from com_recharge.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MidasFailRetryList(
    List<MidasFailfo> fails
) {
    public static MidasFailRetryList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasFailRetryList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MidasFailfo::parseFrom).toList()
        );
    }
    public static MidasFailRetryList parseFrom(java.util.List<ProtoField> fields) {
        return new MidasFailRetryList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.MidasFailfo::parseFrom).toList()
        );
    }
}
