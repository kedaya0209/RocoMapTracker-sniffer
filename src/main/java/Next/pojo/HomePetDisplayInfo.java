// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomePetDisplayInfo(
    int baseConfId,
    int gender,
    byte[] name,
    int level,
    int mutationType,
    int energy,
    int bloodId,
    PetAdditionalNewAttrList attributeNewInfo,
    PetAttributeInfo attributeInfo,
    PetSkillInfo skill,
    int nature,
    int changedNatureNegAttrType,
    int changedNaturePosAttrType,
    int specialityId,
    GlassInfo glassInfo,
    int lastBreakthroughLv
) {
    public static HomePetDisplayInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetDisplayInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PetAdditionalNewAttrList.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetAttributeInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PetSkillInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readMessage(fields, 18) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readInt(fields, 19)
        );
    }
    public static HomePetDisplayInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetDisplayInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PetAdditionalNewAttrList.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.PetAttributeInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.PetSkillInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readMessage(fields, 18) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 18)) : null,
            Pojos.readInt(fields, 19)
        );
    }
}
