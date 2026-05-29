// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicCreateRsp(
    RetInfo retInfo,
    ZoneMagicFeedInfo feed,
    BanInfo banInfo
) {
    public static ZoneFeedMagicCreateRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicCreateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneFeedMagicCreateRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicCreateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneMagicFeedInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
