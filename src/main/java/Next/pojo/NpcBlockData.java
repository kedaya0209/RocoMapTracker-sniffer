// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcBlockData(
    long blockId,
    List<ContentData> contentDatas,
    int useRef,
    long lastUpdateTimestampInUs,
    long version,
    int createTime
) {
    public static NpcBlockData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcBlockData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ContentData::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static NpcBlockData parseFrom(java.util.List<ProtoField> fields) {
        return new NpcBlockData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ContentData::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
