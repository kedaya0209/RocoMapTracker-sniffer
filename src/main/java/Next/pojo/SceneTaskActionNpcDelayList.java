// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SceneTaskActionNpcDelayList(
    List<SceneTaskActionNpcDelayInfo> actions
) {
    public static SceneTaskActionNpcDelayList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneTaskActionNpcDelayList(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SceneTaskActionNpcDelayInfo::parseFrom).toList()
        );
    }
    public static SceneTaskActionNpcDelayList parseFrom(java.util.List<ProtoField> fields) {
        return new SceneTaskActionNpcDelayList(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SceneTaskActionNpcDelayInfo::parseFrom).toList()
        );
    }
}
