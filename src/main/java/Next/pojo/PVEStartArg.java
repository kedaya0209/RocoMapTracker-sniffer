// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PVEStartArg(
    int pveBattleId,
    int playerLevel
) {
    public static PVEStartArg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PVEStartArg(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PVEStartArg parseFrom(java.util.List<ProtoField> fields) {
        return new PVEStartArg(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
