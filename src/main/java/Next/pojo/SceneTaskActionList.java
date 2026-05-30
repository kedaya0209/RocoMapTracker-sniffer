// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SceneTaskActionList(
    int taskId,
    List<SceneTaskActionInfo> actionInfo,
    int taskState
) {
    public static SceneTaskActionList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneTaskActionList(
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SceneTaskActionInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
    public static SceneTaskActionList parseFrom(java.util.List<ProtoField> fields) {
        return new SceneTaskActionList(
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SceneTaskActionInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
}
