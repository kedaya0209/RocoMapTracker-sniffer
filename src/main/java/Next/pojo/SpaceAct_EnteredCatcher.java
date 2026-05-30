// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_EnteredCatcher(
    long actorId,
    int enteredAreaId,
    int areaFuncConfId,
    boolean areaCampUnlock
) {
    public static SpaceAct_EnteredCatcher parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_EnteredCatcher(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static SpaceAct_EnteredCatcher parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_EnteredCatcher(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
