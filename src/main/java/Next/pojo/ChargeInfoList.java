// Generated from com_recharge.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ChargeInfoList(
    List<ChargeInfo> charges
) {
    public static ChargeInfoList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChargeInfoList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChargeInfo::parseFrom).toList()
        );
    }
    public static ChargeInfoList parseFrom(java.util.List<ProtoField> fields) {
        return new ChargeInfoList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChargeInfo::parseFrom).toList()
        );
    }
}
