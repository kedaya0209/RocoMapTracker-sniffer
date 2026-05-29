// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedVideoCreateRsp(
    RetInfo retInfo,
    ZoneMagicFeedInfo feedInfo,
    FeedVideoInfo feedVideoInfo,
    FeedVideoUploadInfo videoUploadInfo,
    BanInfo banInfo
) {
    public static ZoneFeedVideoCreateRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedVideoCreateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FeedVideoInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FeedVideoUploadInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneFeedVideoCreateRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedVideoCreateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FeedVideoInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FeedVideoUploadInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
