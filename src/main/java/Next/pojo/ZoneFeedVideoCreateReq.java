// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedVideoCreateReq(
    String content,
    Position createPos,
    String fileName,
    String fileMd5,
    FeedVideoBaseInfo baseInfo,
    String baseInfoMd5
) {
    public static ZoneFeedVideoCreateReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedVideoCreateReq(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.FeedVideoBaseInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readString(fields, 6)
        );
    }
    public static ZoneFeedVideoCreateReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedVideoCreateReq(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.FeedVideoBaseInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readString(fields, 6)
        );
    }
}
