// Generated from com_goods.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GoodsModifyTransAllInfo(
    long gid,
    long ack,
    List<GoodsModifyTransInfo> goodsTranMsgList,
    long lastUpdateTime,
    List<GoodsModifyTransInfo> bakGoodsTranMsgList,
    long lastSyncTime,
    int lastTickTime,
    long lastScenesvrId,
    long lastAckTime
) {
    public static GoodsModifyTransAllInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsModifyTransAllInfo(
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.GoodsModifyTransInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.GoodsModifyTransInfo::parseFrom).toList(),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 11),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14)
        );
    }
    public static GoodsModifyTransAllInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsModifyTransAllInfo(
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.GoodsModifyTransInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.GoodsModifyTransInfo::parseFrom).toList(),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 11),
            Pojos.readLong(fields, 13),
            Pojos.readLong(fields, 14)
        );
    }
}
