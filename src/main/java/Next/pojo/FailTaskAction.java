// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FailTaskAction(
    int actionType,
    long npcObjId,
    long npcLogicId,
    int optionId,
    String loopAction,
    int refreshId
) {
    public static FailTaskAction parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FailTaskAction(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static FailTaskAction parseFrom(java.util.List<ProtoField> fields) {
        return new FailTaskAction(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
