// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedVideoGetUploadUrlReq(
    String fileName,
    Position createPos,
    String content
) {
    public static ZoneFeedVideoGetUploadUrlReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedVideoGetUploadUrlReq(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readString(fields, 3)
        );
    }
    public static ZoneFeedVideoGetUploadUrlReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedVideoGetUploadUrlReq(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readString(fields, 3)
        );
    }
}
