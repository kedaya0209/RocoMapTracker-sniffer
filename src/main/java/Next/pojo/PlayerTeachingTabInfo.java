// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerTeachingTabInfo(
    List<Teaching> typeAdvantage,
    List<TeachingTask> typeAdvantageTasks,
    List<Teaching> combatMechanism,
    List<TeachingTask> combatMechanismTasks
) {
    public static PlayerTeachingTabInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTeachingTabInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Teaching::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TeachingTask::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Teaching::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.TeachingTask::parseFrom).toList()
        );
    }
    public static PlayerTeachingTabInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTeachingTabInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.Teaching::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.TeachingTask::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Teaching::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.TeachingTask::parseFrom).toList()
        );
    }
}
