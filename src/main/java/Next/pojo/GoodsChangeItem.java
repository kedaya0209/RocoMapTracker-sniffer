// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GoodsChangeItem(
    int type,
    int op,
    int num,
    BagItem bagItem,
    int id,
    PetData petData,
    int srcType,
    int srcId,
    HandbookRecord handbookRecord,
    PetTeamInfo teamInfo,
    int changeReason,
    PetBackpackInfo backpackInfo,
    BagBackpackInfo bagBackpackInfo,
    int gid,
    long coroId,
    PetMedal medal,
    PetBox boxInfo,
    PetBoxPetChange boxPetChange
) {
    public static GoodsChangeItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GoodsChangeItem(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BagItem.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7, 0),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.HandbookRecord.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PetTeamInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetBackpackInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.BagBackpackInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PetMedal.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PetBox.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.PetBoxPetChange.parseFrom(Pojos.readMessage(fields, 18)) : null
        );
    }
    public static GoodsChangeItem parseFrom(java.util.List<ProtoField> fields) {
        return new GoodsChangeItem(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BagItem.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7, 0),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.HandbookRecord.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PetTeamInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetBackpackInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.BagBackpackInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PetMedal.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PetBox.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readMessage(fields, 18) != null ? Next.pojo.PetBoxPetChange.parseFrom(Pojos.readMessage(fields, 18)) : null
        );
    }
}
