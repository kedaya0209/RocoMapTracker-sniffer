// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneShopGetInfoRsp(
    RetInfo retInfo,
    ShopData shopData
) {
    public static ZoneShopGetInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneShopGetInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ShopData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneShopGetInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneShopGetInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ShopData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
