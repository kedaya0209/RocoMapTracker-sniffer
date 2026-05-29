// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerDialogueSyncInfo(
    long targetNpcId,
    long dialogueId,
    long dialogueNpcId,
    int syncType,
    List<Long> selectIds,
    long lastSelectId,
    long progress,
    long optionConfId
) {
    public static PlayerDialogueSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerDialogueSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readLongList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
    public static PlayerDialogueSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerDialogueSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readLongList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
}
