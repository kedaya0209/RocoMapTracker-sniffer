// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActionBonusPityAccu(
    String accuType,
    int pityCount
) {
    public static ActionBonusPityAccu parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusPityAccu(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ActionBonusPityAccu parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusPityAccu(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
