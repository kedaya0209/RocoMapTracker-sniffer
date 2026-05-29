// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedGetFeedCommentRsp(
    RetInfo retInfo,
    FeedCommentListData commentInfo,
    ZoneMagicFeedInfo feed
) {
    public static ZoneFeedGetFeedCommentRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedGetFeedCommentRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FeedCommentListData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneFeedGetFeedCommentRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedGetFeedCommentRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.FeedCommentListData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
