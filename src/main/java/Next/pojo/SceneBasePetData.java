// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SceneBasePetData(
    int gid,
    int nature,
    int height,
    int weight,
    int level,
    int mutationType,
    byte[] name,
    int baseConfId,
    int bloodType,
    int talentRank,
    int medalConfId,
    int medalFxLevel,
    int specialityId,
    List<Integer> realSpecialityIds,
    GlassInfo glassInfo,
    int closenessLv,
    int gender,
    int voice,
    int closenessExp,
    PetSceneInfo sceneInfo,
    int nameSrc
) {
    public static SceneBasePetData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneBasePetData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 14),
            Pojos.readIntList(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readMessage(fields, 22) != null ? Next.pojo.PetSceneInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readInt(fields, 23, 0)
        );
    }
    public static SceneBasePetData parseFrom(java.util.List<ProtoField> fields) {
        return new SceneBasePetData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 14),
            Pojos.readIntList(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readMessage(fields, 22) != null ? Next.pojo.PetSceneInfo.parseFrom(Pojos.readMessage(fields, 22)) : null,
            Pojos.readInt(fields, 23, 0)
        );
    }
}
