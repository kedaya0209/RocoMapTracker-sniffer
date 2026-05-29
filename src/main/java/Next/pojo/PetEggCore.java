// Generated from com_pet_egg.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetEggCore(
    int bloodId,
    int nature,
    List<Integer> breakEnhanceEnum,
    int specialityId,
    int eggConf,
    int mutationType,
    GlassInfo glassInfo,
    List<PetEggAttributeValue> attrList,
    int voice,
    int petInfoId,
    byte[] name,
    int gender,
    int natureAttrId,
    int natureAttrChangeWay,
    ActivityPartnerPetData activityPartnerPetData,
    int goodsSecondReason,
    int nameSrc
) {
    public static PetEggCore parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEggCore(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetEggAttributeValue::parseFrom).toList(),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14, 0),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ActivityPartnerPetData.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17, 0)
        );
    }
    public static PetEggCore parseFrom(java.util.List<ProtoField> fields) {
        return new PetEggCore(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetEggAttributeValue::parseFrom).toList(),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14, 0),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ActivityPartnerPetData.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17, 0)
        );
    }
}
