// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NpcCanbeTeleportNty(
    long npcId,
    boolean canBeTeleport
) {
    public static SpaceAct_NpcCanbeTeleportNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcCanbeTeleportNty(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static SpaceAct_NpcCanbeTeleportNty parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcCanbeTeleportNty(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
