// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlePetEscape(
    int petId,
    int performType
) {
    public static BattlePetEscape parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePetEscape(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BattlePetEscape parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePetEscape(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
