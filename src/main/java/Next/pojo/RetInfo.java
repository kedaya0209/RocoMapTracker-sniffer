// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RetInfo(
    int retCode,
    String retMsg,
    GoodsReward goodsReward,
    GoodsChange goodsChangeInfo
) {
    public static RetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GoodsChange.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static RetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GoodsChange.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
