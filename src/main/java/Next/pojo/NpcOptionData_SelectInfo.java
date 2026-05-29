// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NpcOptionData_SelectInfo(
    int selectId,
    boolean enabled,
    int remainingTimes,
    long lastResetTime,
    boolean resetAfterInteract,
    boolean hasBeenSelected,
    long exhaustedTime,
    int dialogId,
    int hasBeenSelectedTimes
) {
    public static NpcOptionData_SelectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcOptionData_SelectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static NpcOptionData_SelectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NpcOptionData_SelectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
