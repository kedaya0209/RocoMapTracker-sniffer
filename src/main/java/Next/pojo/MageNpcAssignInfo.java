// Generated from com_magebook.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MageNpcAssignInfo(
    long id,
    int type,
    List<Integer> npcs
) {
    public static MageNpcAssignInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MageNpcAssignInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static MageNpcAssignInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MageNpcAssignInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
