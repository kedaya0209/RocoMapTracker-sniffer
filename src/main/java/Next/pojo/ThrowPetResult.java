// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowPetResult(
    boolean isExceedInteractionThreshold
) {
    public static ThrowPetResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowPetResult(
            Pojos.readBool(fields, 1)
        );
    }
    public static ThrowPetResult parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowPetResult(
            Pojos.readBool(fields, 1)
        );
    }
}
