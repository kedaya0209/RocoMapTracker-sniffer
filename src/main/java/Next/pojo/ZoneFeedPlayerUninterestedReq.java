// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedPlayerUninterestedReq(
    int uin,
    long feedId,
    int category
) {
    public static ZoneFeedPlayerUninterestedReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedPlayerUninterestedReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneFeedPlayerUninterestedReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedPlayerUninterestedReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
