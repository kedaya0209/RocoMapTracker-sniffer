// Generated from com_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AutoParam(
    String key,
    boolean require,
    int type,
    String paramName,
    String paramDesc,
    List<String> paramStr
) {
    public static AutoParam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AutoParam(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readStringList(fields, 7)
        );
    }
    public static AutoParam parseFrom(java.util.List<ProtoField> fields) {
        return new AutoParam(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readStringList(fields, 7)
        );
    }
}
