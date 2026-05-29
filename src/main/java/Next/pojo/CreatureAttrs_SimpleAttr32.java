// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CreatureAttrs_SimpleAttr32(
    int val
) {
    public static CreatureAttrs_SimpleAttr32 parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CreatureAttrs_SimpleAttr32(
            Pojos.readInt(fields, 2)
        );
    }
    public static CreatureAttrs_SimpleAttr32 parseFrom(java.util.List<ProtoField> fields) {
        return new CreatureAttrs_SimpleAttr32(
            Pojos.readInt(fields, 2)
        );
    }
}
