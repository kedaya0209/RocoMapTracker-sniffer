// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicDeleteRsp(
    RetInfo retInfo,
    long feedId,
    long gridId
) {
    public static ZoneFeedMagicDeleteRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicDeleteRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneFeedMagicDeleteRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicDeleteRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
