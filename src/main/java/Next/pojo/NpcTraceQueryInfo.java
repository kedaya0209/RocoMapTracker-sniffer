// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcTraceQueryInfo(
    List<Integer> queryNpcCfgIds,
    NpcTraceQueryResult finalResult,
    List<Integer> queryNpcContentIds
) {
    public static NpcTraceQueryInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcTraceQueryInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NpcTraceQueryResult.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
    public static NpcTraceQueryInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NpcTraceQueryInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.NpcTraceQueryResult.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
}
