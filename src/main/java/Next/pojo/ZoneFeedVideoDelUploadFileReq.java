// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedVideoDelUploadFileReq(
    String fileName
) {
    public static ZoneFeedVideoDelUploadFileReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedVideoDelUploadFileReq(
            Pojos.readString(fields, 1)
        );
    }
    public static ZoneFeedVideoDelUploadFileReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedVideoDelUploadFileReq(
            Pojos.readString(fields, 1)
        );
    }
}
