// Generated from com_goods.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GoodsModifyTransInfo(
    long seq,
    int finish,
    int type,
    GoodsModifyMsg goodsModifyMsg,
    GoodsTransCBTestInfo testInfo
) {
    public static GoodsModifyTransInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsModifyTransInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GoodsModifyMsg.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.GoodsTransCBTestInfo.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
    public static GoodsModifyTransInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsModifyTransInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GoodsModifyMsg.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.GoodsTransCBTestInfo.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
}
