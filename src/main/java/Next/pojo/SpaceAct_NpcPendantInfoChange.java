// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_NpcPendantInfoChange(
    long npcId,
    int pendantCfgId,
    boolean enable,
    List<SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo> changedPendantItemInfos
) {
    public static SpaceAct_NpcPendantInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcPendantInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_NpcPendantInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcPendantInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SpaceAct_NpcPendantInfoChange_ChangedNpcPendantItemInfo::parseFrom).toList()
        );
    }
}
