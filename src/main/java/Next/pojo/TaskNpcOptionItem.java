// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TaskNpcOptionItem(
    int npcCfgId,
    int optionId,
    int isDel,
    int lastUpdateTask,
    int lastUpdateSeq
) {
    public static TaskNpcOptionItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskNpcOptionItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static TaskNpcOptionItem parseFrom(java.util.List<ProtoField> fields) {
        return new TaskNpcOptionItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
