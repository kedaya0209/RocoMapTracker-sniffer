// Generated from com_goods.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GoodsItem(
    int type,
    int id,
    int num,
    int tag,
    int srcType,
    int srcId,
    boolean firstGet,
    PetData petData,
    int rewardReason,
    int monsterLevel,
    int ballId,
    boolean isAmbush,
    boolean isCorrectUse,
    boolean isFromBattle,
    boolean isExtInfo,
    int param,
    long coroId,
    boolean isTogetherCatchGift,
    PetEggBrief eggInfo,
    PetEggCore eggCore,
    List<Integer> gids
) {
    public static GoodsItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsItem(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PetEggBrief.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PetEggCore.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readIntList(fields, 21)
        );
    }
    public static GoodsItem parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsItem(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readBool(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.PetEggBrief.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readMessage(fields, 20) != null ? Next.pojo.PetEggCore.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readIntList(fields, 21)
        );
    }
}
