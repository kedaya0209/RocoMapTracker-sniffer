// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BagItem(
    int gid,
    int id,
    long num,
    int updateTime,
    int expireTime,
    boolean canCharge,
    int remainUseCnt,
    int maxUseCnt,
    int effectValue,
    boolean canInBattle,
    int bagItemFlags,
    int level,
    int stage,
    int type,
    PetEggBrief eggData,
    int fruitActiveTimestamp,
    PetMedalData medalData,
    long liabilitiesNum,
    List<FinishFactionItem> finishedFaction
) {
    public static BagItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BagItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PetEggBrief.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PetMedalData.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readLong(fields, 18),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.FinishFactionItem::parseFrom).toList()
        );
    }
    public static BagItem parseFrom(java.util.List<ProtoField> fields) {
        return new BagItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PetEggBrief.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PetMedalData.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readLong(fields, 18),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.FinishFactionItem::parseFrom).toList()
        );
    }
}
