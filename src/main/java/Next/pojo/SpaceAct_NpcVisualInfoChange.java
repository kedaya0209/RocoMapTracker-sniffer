// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NpcVisualInfoChange(
    long actorId,
    boolean cannotBeSeen,
    int changeReason,
    long npcHideFlag
) {
    public static SpaceAct_NpcVisualInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcVisualInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readLong(fields, 4)
        );
    }
    public static SpaceAct_NpcVisualInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcVisualInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readLong(fields, 4)
        );
    }
}
