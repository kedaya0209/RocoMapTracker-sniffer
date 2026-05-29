// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityPartnerData(
    PetData inheritPetData,
    List<PetPartnerItem> petPartnerItems,
    int selectPetBaseId,
    boolean committed,
    boolean chooseInheritPet,
    boolean maintainExpression
) {
    public static PlayerActivityInfo_ActivityPartnerData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityPartnerData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetPartnerItem::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static PlayerActivityInfo_ActivityPartnerData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityPartnerData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetPartnerItem::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
