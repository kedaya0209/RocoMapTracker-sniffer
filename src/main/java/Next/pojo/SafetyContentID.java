// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SafetyContentID(
    String idType,
    List<String> idList
) {
    public static SafetyContentID parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SafetyContentID(
            Pojos.readString(fields, 1),
            Pojos.readStringList(fields, 2)
        );
    }
    public static SafetyContentID parseFrom(java.util.List<ProtoField> fields) {
        return new SafetyContentID(
            Pojos.readString(fields, 1),
            Pojos.readStringList(fields, 2)
        );
    }
}
