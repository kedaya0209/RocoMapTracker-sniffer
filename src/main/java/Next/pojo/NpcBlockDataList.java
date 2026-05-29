// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcBlockDataList(
    List<NpcBlockData> blockDatas
) {
    public static NpcBlockDataList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcBlockDataList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcBlockData::parseFrom).toList()
        );
    }
    public static NpcBlockDataList parseFrom(java.util.List<ProtoField> fields) {
        return new NpcBlockDataList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.NpcBlockData::parseFrom).toList()
        );
    }
}
