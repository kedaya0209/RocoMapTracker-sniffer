// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcTraceData(
    int npcCfgId,
    List<ContentTraceData> traceDatas
) {
    public static NpcTraceData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcTraceData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ContentTraceData::parseFrom).toList()
        );
    }
    public static NpcTraceData parseFrom(java.util.List<ProtoField> fields) {
        return new NpcTraceData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ContentTraceData::parseFrom).toList()
        );
    }
}
