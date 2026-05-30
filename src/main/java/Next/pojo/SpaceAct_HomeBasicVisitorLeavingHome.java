// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomeBasicVisitorLeavingHome(
    long actorId,
    byte[] name,
    boolean isHomeOwner,
    int homeOwnerOnlineStatus
) {
    public static SpaceAct_HomeBasicVisitorLeavingHome parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomeBasicVisitorLeavingHome(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static SpaceAct_HomeBasicVisitorLeavingHome parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomeBasicVisitorLeavingHome(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
