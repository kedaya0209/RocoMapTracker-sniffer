// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedCommentAttitudeReq(
    int uin,
    long feedId,
    long feedbackId,
    int attitude,
    int category
) {
    public static ZoneFeedCommentAttitudeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedCommentAttitudeReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneFeedCommentAttitudeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedCommentAttitudeReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
