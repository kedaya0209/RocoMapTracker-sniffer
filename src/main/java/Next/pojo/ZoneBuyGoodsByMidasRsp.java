// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBuyGoodsByMidasRsp(
    RetInfo retInfo,
    byte[] appMetaData,
    byte[] token,
    byte[] urlParam,
    int goodsId,
    byte[] midasGoodsId,
    int type,
    int shopId,
    ShopData shopData
) {
    public static ZoneBuyGoodsByMidasRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBuyGoodsByMidasRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.ShopData.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static ZoneBuyGoodsByMidasRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBuyGoodsByMidasRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.ShopData.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
