// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneExchangeRsp(
    RetInfo retInfo,
    GoodsReward reward,
    CSUnlockedExchangeRecipe recipes
) {
    public static ZoneExchangeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.CSUnlockedExchangeRecipe.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneExchangeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.CSUnlockedExchangeRecipe.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
