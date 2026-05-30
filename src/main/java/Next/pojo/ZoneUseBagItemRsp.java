// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUseBagItemRsp(
    RetInfo retInfo,
    GoodsReward reward,
    int useBagId
) {
    public static ZoneUseBagItemRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUseBagItemRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneUseBagItemRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUseBagItemRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 4)
        );
    }
}
