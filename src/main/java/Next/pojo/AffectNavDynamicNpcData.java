// Generated from com_actor.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AffectNavDynamicNpcData(
    int npcPointId,
    int resultId
) {
    public static AffectNavDynamicNpcData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AffectNavDynamicNpcData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static AffectNavDynamicNpcData parseFrom(java.util.List<ProtoField> fields) {
        return new AffectNavDynamicNpcData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
