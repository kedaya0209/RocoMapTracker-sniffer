// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmTestRandomShopResultRsp_GoodsStat(
    int goodsId,
    int count,
    String goodsName
) {
    public static ZoneGmTestRandomShopResultRsp_GoodsStat parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmTestRandomShopResultRsp_GoodsStat(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
    public static ZoneGmTestRandomShopResultRsp_GoodsStat parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmTestRandomShopResultRsp_GoodsStat(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
}
