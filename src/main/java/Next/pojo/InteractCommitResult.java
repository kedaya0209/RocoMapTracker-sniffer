// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InteractCommitResult(
    int actionType,
    byte[] actRspParams
) {
    public static InteractCommitResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InteractCommitResult(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static InteractCommitResult parseFrom(java.util.List<ProtoField> fields) {
        return new InteractCommitResult(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
