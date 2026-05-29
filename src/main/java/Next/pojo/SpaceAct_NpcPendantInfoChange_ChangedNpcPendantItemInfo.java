// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo(
    int id,
    boolean enable,
    int status
) {
    public static SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
