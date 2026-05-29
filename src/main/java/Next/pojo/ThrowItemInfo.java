// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowItemInfo(
    int curSelectedThrowType,
    int curSelectedGid,
    int lastSelectedPetGid
) {
    public static ThrowItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowItemInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ThrowItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowItemInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
