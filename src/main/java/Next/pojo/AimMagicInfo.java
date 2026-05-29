// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AimMagicInfo(
    int chargedLevel
) {
    public static AimMagicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AimMagicInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static AimMagicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AimMagicInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
