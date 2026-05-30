// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmTestRandomShopResultRsp(
    RetInfo retInfo,
    int shopId,
    List<ZoneGmTestRandomShopResultRsp_GoodsStat> goodsStats
) {
    public static ZoneGmTestRandomShopResultRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmTestRandomShopResultRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneGmTestRandomShopResultRsp_GoodsStat::parseFrom).toList()
        );
    }
    public static ZoneGmTestRandomShopResultRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmTestRandomShopResultRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneGmTestRandomShopResultRsp_GoodsStat::parseFrom).toList()
        );
    }
}
