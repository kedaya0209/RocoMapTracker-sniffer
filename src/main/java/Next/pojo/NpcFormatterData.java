// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcFormatterData(
    int contentCfgId,
    long blockId,
    List<Long> npcObjIds
) {
    public static NpcFormatterData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcFormatterData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLongList(fields, 3)
        );
    }
    public static NpcFormatterData parseFrom(java.util.List<ProtoField> fields) {
        return new NpcFormatterData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLongList(fields, 3)
        );
    }
}
