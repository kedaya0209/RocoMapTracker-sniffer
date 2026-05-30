// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetFeedDetailRsp(
    RetInfo retInfo,
    ZoneMagicFeedInfo feedInfo,
    FeedVideoInfo feedVideoInfo
) {
    public static ZoneGetFeedDetailRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetFeedDetailRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FeedVideoInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneGetFeedDetailRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetFeedDetailRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.FeedVideoInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
