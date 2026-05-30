// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicFeedbackReq(
    int uin,
    long feedId,
    String commentContent,
    int category
) {
    public static ZoneFeedMagicFeedbackReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicFeedbackReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneFeedMagicFeedbackReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicFeedbackReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
