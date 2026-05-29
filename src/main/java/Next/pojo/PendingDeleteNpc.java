// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PendingDeleteNpc(
    long npcObjId,
    long npcLogicId
) {
    public static PendingDeleteNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PendingDeleteNpc(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static PendingDeleteNpc parseFrom(java.util.List<ProtoField> fields) {
        return new PendingDeleteNpc(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
