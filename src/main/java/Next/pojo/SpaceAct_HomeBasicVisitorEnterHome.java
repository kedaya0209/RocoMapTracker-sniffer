// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomeBasicVisitorEnterHome(
    long actorId,
    byte[] name,
    boolean isHomeOwner,
    int homeOwnerOnlineStatus
) {
    public static SpaceAct_HomeBasicVisitorEnterHome parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomeBasicVisitorEnterHome(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static SpaceAct_HomeBasicVisitorEnterHome parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomeBasicVisitorEnterHome(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
