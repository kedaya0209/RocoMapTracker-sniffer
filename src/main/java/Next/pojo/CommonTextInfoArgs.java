// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CommonTextInfoArgs(
    int type,
    String param
) {
    public static CommonTextInfoArgs parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CommonTextInfoArgs(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static CommonTextInfoArgs parseFrom(java.util.List<ProtoField> fields) {
        return new CommonTextInfoArgs(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
