// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedGetFeedCommentReq(
    int uin,
    long feedId,
    int type,
    int pageNum
) {
    public static ZoneFeedGetFeedCommentReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedGetFeedCommentReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneFeedGetFeedCommentReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedGetFeedCommentReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
