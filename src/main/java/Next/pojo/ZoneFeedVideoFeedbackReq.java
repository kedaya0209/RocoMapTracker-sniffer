// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedVideoFeedbackReq(
    int uin,
    long feedId,
    String commentContent
) {
    public static ZoneFeedVideoFeedbackReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedVideoFeedbackReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
    public static ZoneFeedVideoFeedbackReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedVideoFeedbackReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
}
