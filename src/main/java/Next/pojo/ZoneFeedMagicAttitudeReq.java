// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicAttitudeReq(
    int uin,
    long feedId,
    int attitude,
    int category
) {
    public static ZoneFeedMagicAttitudeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicAttitudeReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneFeedMagicAttitudeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicAttitudeReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
