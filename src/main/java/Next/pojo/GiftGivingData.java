// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GiftGivingData(
    int receiverUin,
    long giftUniqueId,
    int expireTime,
    int goodsType,
    int goodsId,
    int goodsNum,
    PetData petData,
    boolean forbidExpireTime
) {
    public static GiftGivingData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GiftGivingData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8)
        );
    }
    public static GiftGivingData parseFrom(java.util.List<ProtoField> fields) {
        return new GiftGivingData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8)
        );
    }
}
