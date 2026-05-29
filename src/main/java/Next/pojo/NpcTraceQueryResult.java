// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NpcTraceQueryResult(
    int npcCfgId,
    int petBaseId,
    int contentId,
    int areaCfgId,
    long dist
) {
    public static NpcTraceQueryResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcTraceQueryResult(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static NpcTraceQueryResult parseFrom(java.util.List<ProtoField> fields) {
        return new NpcTraceQueryResult(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
