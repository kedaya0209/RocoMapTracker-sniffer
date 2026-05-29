// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FeedCommentListData(
    long feedId,
    int pageNum,
    List<FeedCommentInfo> commentList
) {
    public static FeedCommentListData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FeedCommentListData(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FeedCommentInfo::parseFrom).toList()
        );
    }
    public static FeedCommentListData parseFrom(java.util.List<ProtoField> fields) {
        return new FeedCommentListData(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FeedCommentInfo::parseFrom).toList()
        );
    }
}
