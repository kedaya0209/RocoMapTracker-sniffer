// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePublishVideoToWechatReq(
    String videoFileId
) {
    public static ZonePublishVideoToWechatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePublishVideoToWechatReq(
            Pojos.readString(fields, 1)
        );
    }
    public static ZonePublishVideoToWechatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePublishVideoToWechatReq(
            Pojos.readString(fields, 1)
        );
    }
}
