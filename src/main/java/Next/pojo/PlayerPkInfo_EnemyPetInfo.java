// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerPkInfo_EnemyPetInfo(
    int level,
    int petbaseId,
    int mutationType,
    byte[] name,
    List<Integer> skillDamType,
    int lastBreakthroughLv,
    int featureSkill,
    GlassInfo glassInfo,
    PetTypeInfo type,
    int gid,
    int hpMax
) {
    public static PlayerPkInfo_EnemyPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPkInfo_EnemyPetInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 28),
            Pojos.readBytes(fields, 29),
            Pojos.readIntList(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readMessage(fields, 34) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 34)) : null,
            Pojos.readMessage(fields, 35) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 35)) : null,
            Pojos.readInt(fields, 36),
            Pojos.readInt(fields, 37)
        );
    }
    public static PlayerPkInfo_EnemyPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPkInfo_EnemyPetInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 28),
            Pojos.readBytes(fields, 29),
            Pojos.readIntList(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readMessage(fields, 34) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 34)) : null,
            Pojos.readMessage(fields, 35) != null ? Next.pojo.PetTypeInfo.parseFrom(Pojos.readMessage(fields, 35)) : null,
            Pojos.readInt(fields, 36),
            Pojos.readInt(fields, 37)
        );
    }
}
