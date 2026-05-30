// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskContentItem(
    int npcContentId,
    int isHide,
    int isDel,
    int lastUpdateTask,
    int lastUpdateSeq,
    TaskContentOptionList options,
    int saleLock,
    int isOpenorclose
) {
    public static TaskContentItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskContentItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.TaskContentOptionList.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static TaskContentItem parseFrom(java.util.List<ProtoField> fields) {
        return new TaskContentItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.TaskContentOptionList.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
