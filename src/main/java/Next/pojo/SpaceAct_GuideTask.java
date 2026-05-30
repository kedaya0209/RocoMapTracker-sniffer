// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_GuideTask(
    List<SpaceAct_GuideTask_GuideItem> guideList
) {
    public static SpaceAct_GuideTask parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_GuideTask(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SpaceAct_GuideTask_GuideItem::parseFrom).toList()
        );
    }
    public static SpaceAct_GuideTask parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_GuideTask(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SpaceAct_GuideTask_GuideItem::parseFrom).toList()
        );
    }
}
