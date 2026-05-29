// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicAttitudeRsp(
    RetInfo retInfo,
    ZoneMagicFeedInfo feed
) {
    public static ZoneFeedMagicAttitudeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicAttitudeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneFeedMagicAttitudeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicAttitudeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
