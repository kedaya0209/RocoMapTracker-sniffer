// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientNpcBlackboard(
    int tod,
    int sleeping,
    int newSkill,
    long aiStatus,
    boolean backOfHead,
    int preActTag,
    int preActParam
) {
    public static ClientNpcBlackboard parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientNpcBlackboard(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static ClientNpcBlackboard parseFrom(java.util.List<ProtoField> fields) {
        return new ClientNpcBlackboard(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
