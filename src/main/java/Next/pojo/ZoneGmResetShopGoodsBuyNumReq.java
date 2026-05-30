// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmResetShopGoodsBuyNumReq(
    int shopId,
    List<Integer> goodsId
) {
    public static ZoneGmResetShopGoodsBuyNumReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmResetShopGoodsBuyNumReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneGmResetShopGoodsBuyNumReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmResetShopGoodsBuyNumReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
