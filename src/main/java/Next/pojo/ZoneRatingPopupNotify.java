// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRatingPopupNotify(
    int ratingPopupId
) {
    public static ZoneRatingPopupNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRatingPopupNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneRatingPopupNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRatingPopupNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
