// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicFeedbackRsp(
    RetInfo retInfo,
    ZoneMagicFeedInfo feed,
    BanInfo banInfo,
    FeedCommentInfo commentInfo
) {
    public static ZoneFeedMagicFeedbackRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicFeedbackRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FeedCommentInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneFeedMagicFeedbackRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicFeedbackRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FeedCommentInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
