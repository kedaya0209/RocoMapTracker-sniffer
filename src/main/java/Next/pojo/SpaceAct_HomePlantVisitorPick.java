// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomePlantVisitorPick(
    long actorId,
    int landId
) {
    public static SpaceAct_HomePlantVisitorPick parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomePlantVisitorPick(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static SpaceAct_HomePlantVisitorPick parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomePlantVisitorPick(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
