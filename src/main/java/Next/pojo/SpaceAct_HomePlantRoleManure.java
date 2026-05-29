// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_HomePlantRoleManure(
    long actorId,
    int landId
) {
    public static SpaceAct_HomePlantRoleManure parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HomePlantRoleManure(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static SpaceAct_HomePlantRoleManure parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HomePlantRoleManure(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
