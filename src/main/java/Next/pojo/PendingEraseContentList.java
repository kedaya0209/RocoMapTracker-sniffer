// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PendingEraseContentList(
    List<Integer> owlPendingEraseContents,
    List<RulePendingEraseContentList> pendingEraseContents
) {
    public static PendingEraseContentList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PendingEraseContentList(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RulePendingEraseContentList::parseFrom).toList()
        );
    }
    public static PendingEraseContentList parseFrom(java.util.List<ProtoField> fields) {
        return new PendingEraseContentList(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RulePendingEraseContentList::parseFrom).toList()
        );
    }
}
