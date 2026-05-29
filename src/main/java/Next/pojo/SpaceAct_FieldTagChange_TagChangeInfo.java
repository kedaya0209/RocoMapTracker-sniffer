// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_FieldTagChange_TagChangeInfo(
    List<Long> tagData,
    int resultTagType
) {
    public static SpaceAct_FieldTagChange_TagChangeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_FieldTagChange_TagChangeInfo(
            Pojos.readLongList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static SpaceAct_FieldTagChange_TagChangeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_FieldTagChange_TagChangeInfo(
            Pojos.readLongList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
