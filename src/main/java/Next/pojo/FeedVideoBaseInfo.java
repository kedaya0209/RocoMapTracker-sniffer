// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FeedVideoBaseInfo(
    List<Integer> fashionId,
    List<Integer> petBaseId,
    List<String> chatMsg,
    Position playerPos,
    int version
) {
    public static FeedVideoBaseInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FeedVideoBaseInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readStringList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
    public static FeedVideoBaseInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FeedVideoBaseInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readStringList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
}
