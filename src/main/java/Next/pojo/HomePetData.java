// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePetData(
    int gid,
    int baseConfId,
    int nature,
    PetAttributeInfo attributeInfo,
    int mutationType,
    GlassInfo glassInfo,
    int bloodId,
    int height,
    int weight,
    int gender,
    byte[] name,
    int level,
    int energy,
    PetAdditionalNewAttrList attributeNewInfo,
    PetSkillInfo skill,
    int changedNatureNegAttrType,
    int changedNaturePosAttrType,
    int specialityId,
    int lastBreakthroughLv,
    int voice,
    int homePetNpcCfgId,
    List<Integer> realSpecialityIds,
    HomePetGainData gainData
) {
    public static HomePetData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetAttributeInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PetAdditionalNewAttrList.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PetSkillInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 23),
            Pojos.readIntList(fields, 24),
            Pojos.readMessage(fields, 25) != null ? Next.pojo.HomePetGainData.parseFrom(Pojos.readMessage(fields, 25)) : null
        );
    }
    public static HomePetData parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetAttributeInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PetAdditionalNewAttrList.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PetSkillInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 23),
            Pojos.readIntList(fields, 24),
            Pojos.readMessage(fields, 25) != null ? Next.pojo.HomePetGainData.parseFrom(Pojos.readMessage(fields, 25)) : null
        );
    }
}
