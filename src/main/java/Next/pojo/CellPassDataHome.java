// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CellPassDataHome(
    byte[] homeName,
    boolean ownerIsOnline
) {
    public static CellPassDataHome parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellPassDataHome(
            Pojos.readBytes(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static CellPassDataHome parseFrom(java.util.List<ProtoField> fields) {
        return new CellPassDataHome(
            Pojos.readBytes(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
