// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NameChange(
    long actorId,
    String name
) {
    public static SpaceAct_NameChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NameChange(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static SpaceAct_NameChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NameChange(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
