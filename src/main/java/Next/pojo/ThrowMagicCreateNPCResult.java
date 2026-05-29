// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowMagicCreateNPCResult(
    long npcObjId
) {
    public static ThrowMagicCreateNPCResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowMagicCreateNPCResult(
            Pojos.readLong(fields, 1)
        );
    }
    public static ThrowMagicCreateNPCResult parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowMagicCreateNPCResult(
            Pojos.readLong(fields, 1)
        );
    }
}
