// Generated from com_goods.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GiftData(
    int goodsType,
    int goodsId,
    int goodsNum,
    int expireTime,
    int receiveState,
    long giftUniqueId,
    PetData petData,
    boolean forbidExpireTime
) {
    public static GiftData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GiftData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8)
        );
    }
    public static GiftData parseFrom(java.util.List<ProtoField> fields) {
        return new GiftData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8)
        );
    }
}
