// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneVisualItemUpgradeRsp(
    RetInfo retInfo,
    GoodsReward reward
) {
    public static ZoneVisualItemUpgradeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneVisualItemUpgradeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneVisualItemUpgradeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneVisualItemUpgradeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
