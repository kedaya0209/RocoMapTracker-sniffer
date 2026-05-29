// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskScenesvrStateData(
    TaskUnlockWorldMapList unlockWorlds,
    List<TaskScenesvrStateList> npcStateData,
    int lastExcuteTime,
    int lastRecoveTime,
    long lastUpdateSeq,
    int isNeedRecove,
    TaskStoryFlagInfo storyFlagInfos,
    long lastLoginTimes,
    List<TaskContentStateList> contentStateData,
    int lastLoginTime
) {
    public static TaskScenesvrStateData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskScenesvrStateData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.TaskUnlockWorldMapList.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskScenesvrStateList::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.TaskStoryFlagInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.TaskContentStateList::parseFrom).toList(),
            Pojos.readInt(fields, 11)
        );
    }
    public static TaskScenesvrStateData parseFrom(java.util.List<ProtoField> fields) {
        return new TaskScenesvrStateData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.TaskUnlockWorldMapList.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskScenesvrStateList::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.TaskStoryFlagInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.TaskContentStateList::parseFrom).toList(),
            Pojos.readInt(fields, 11)
        );
    }
}
