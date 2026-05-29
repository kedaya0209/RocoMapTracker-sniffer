// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlerCommentData(
    String name,
    int recoverHp,
    int recoverEnergy,
    String location
) {
    public static BattlerCommentData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlerCommentData(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
    public static BattlerCommentData parseFrom(java.util.List<ProtoField> fields) {
        return new BattlerCommentData(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4)
        );
    }
}
