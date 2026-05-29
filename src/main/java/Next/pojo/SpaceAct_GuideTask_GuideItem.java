// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_GuideTask_GuideItem(
    List<ActorInfo> npcs,
    int taskId,
    Position pos,
    List<GuideInfo> guideInfo
) {
    public static SpaceAct_GuideTask_GuideItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_GuideTask_GuideItem(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.GuideInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_GuideTask_GuideItem parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_GuideTask_GuideItem(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.GuideInfo::parseFrom).toList()
        );
    }
}
