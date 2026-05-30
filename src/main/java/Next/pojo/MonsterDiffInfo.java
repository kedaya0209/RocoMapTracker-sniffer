// Generated from com_monster.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MonsterDiffInfo(
    int height,
    int weight,
    int nature,
    int mutationType,
    int bloodMixSkillDamType,
    GlassInfo glassInfo,
    int voice,
    int gender
) {
    public static MonsterDiffInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MonsterDiffInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static MonsterDiffInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MonsterDiffInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
