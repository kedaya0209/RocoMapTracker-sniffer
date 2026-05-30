// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DamageParam(
    int petId,
    int damageParam
) {
    public static DamageParam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DamageParam(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static DamageParam parseFrom(java.util.List<ProtoField> fields) {
        return new DamageParam(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
