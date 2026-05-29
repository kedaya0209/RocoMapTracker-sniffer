// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSellBagItemRsp(
    RetInfo retInfo,
    GoodsReward reward
) {
    public static ZoneSellBagItemRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSellBagItemRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSellBagItemRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSellBagItemRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
