// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBagInfo(
    int gid,
    List<BagItemTypeList> itemList,
    int equippedBallNum,
    List<HadItemInfo> hadItemInfo,
    BagBackpackInfo bagBackpack,
    List<PetMedalTaskInfo> petMedalTaskInfo,
    List<HadItemList> hadItemList,
    int isCopy,
    long version,
    List<GiftDropWeithBagNumInfo> dropWeightInfo,
    List<BagItemMaskList> maskBagList,
    int lastCheckMaskTime,
    PlayerBagItemIdFlagList bagItemIdFlag
) {
    public static PlayerBagInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBagInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BagItemTypeList::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HadItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BagBackpackInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetMedalTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.HadItemList::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.GiftDropWeithBagNumInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.BagItemMaskList::parseFrom).toList(),
            Pojos.readInt(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerBagItemIdFlagList.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
    public static PlayerBagInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBagInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BagItemTypeList::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HadItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BagBackpackInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetMedalTaskInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.HadItemList::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.GiftDropWeithBagNumInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 13).stream().map(Next.pojo.BagItemMaskList::parseFrom).toList(),
            Pojos.readInt(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerBagItemIdFlagList.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
}
