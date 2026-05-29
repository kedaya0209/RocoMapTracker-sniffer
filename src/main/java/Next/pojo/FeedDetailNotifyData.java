// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FeedDetailNotifyData(
    List<GridFeedDetailInfo> gridFeedList,
    long gridId,
    List<Long> gridList
) {
    public static FeedDetailNotifyData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FeedDetailNotifyData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GridFeedDetailInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLongList(fields, 3)
        );
    }
    public static FeedDetailNotifyData parseFrom(java.util.List<ProtoField> fields) {
        return new FeedDetailNotifyData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GridFeedDetailInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLongList(fields, 3)
        );
    }
}
