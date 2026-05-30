// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerFeedInfoNotify(
    FeedDetailNotifyData data,
    long gridId
) {
    public static ZonePlayerFeedInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerFeedInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.FeedDetailNotifyData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2)
        );
    }
    public static ZonePlayerFeedInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerFeedInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.FeedDetailNotifyData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2)
        );
    }
}
