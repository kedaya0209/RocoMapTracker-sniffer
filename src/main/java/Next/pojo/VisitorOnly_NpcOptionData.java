// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisitorOnly_NpcOptionData(
    long visitorId,
    List<NpcOptionData> optionDatas
) {
    public static VisitorOnly_NpcOptionData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisitorOnly_NpcOptionData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.NpcOptionData::parseFrom).toList()
        );
    }
    public static VisitorOnly_NpcOptionData parseFrom(java.util.List<ProtoField> fields) {
        return new VisitorOnly_NpcOptionData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.NpcOptionData::parseFrom).toList()
        );
    }
}
