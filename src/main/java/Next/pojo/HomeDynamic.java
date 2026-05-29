// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeDynamic(
    int type,
    int value
) {
    public static HomeDynamic parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeDynamic(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
    public static HomeDynamic parseFrom(java.util.List<ProtoField> fields) {
        return new HomeDynamic(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
}
