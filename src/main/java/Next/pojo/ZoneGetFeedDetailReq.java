// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetFeedDetailReq(
    long feedId
) {
    public static ZoneGetFeedDetailReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetFeedDetailReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneGetFeedDetailReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetFeedDetailReq(
            Pojos.readLong(fields, 1)
        );
    }
}
