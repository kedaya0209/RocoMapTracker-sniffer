// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedVideoGetUploadUrlRsp(
    RetInfo retInfo,
    String fileName,
    String uploadUrl,
    FeedVideoUploadInfo videoUploadInfo,
    BanInfo banInfo
) {
    public static ZoneFeedVideoGetUploadUrlRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedVideoGetUploadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FeedVideoUploadInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneFeedVideoGetUploadUrlRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedVideoGetUploadUrlRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.FeedVideoUploadInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
