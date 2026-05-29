// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_NpcOptionAddSelects(
    long npcId,
    int optionId,
    List<ActorInfo_NpcDialogSelectInfo> selectInfos,
    long avatarId
) {
    public static SpaceAct_NpcOptionAddSelects parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcOptionAddSelects(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo_NpcDialogSelectInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4)
        );
    }
    public static SpaceAct_NpcOptionAddSelects parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcOptionAddSelects(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo_NpcDialogSelectInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4)
        );
    }
}
