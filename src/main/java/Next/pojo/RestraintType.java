// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RestraintType(
    int petId,
    int restraintType
) {
    public static RestraintType parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RestraintType(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static RestraintType parseFrom(java.util.List<ProtoField> fields) {
        return new RestraintType(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
