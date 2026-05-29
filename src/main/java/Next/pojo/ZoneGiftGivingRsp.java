// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGiftGivingRsp(
    RetInfo retInfo,
    BanInfo banInfo
) {
    public static ZoneGiftGivingRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGiftGivingRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGiftGivingRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGiftGivingRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
