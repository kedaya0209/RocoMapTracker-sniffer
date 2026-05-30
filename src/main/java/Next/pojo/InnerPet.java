// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InnerPet(
    int petbaseId,
    int mutationType,
    int petLv,
    int hpTalent,
    int attackTalent,
    int specialAttackTalent,
    int defenseTalent,
    int specialDefenseTalent,
    int speedTalent,
    int gender,
    int nature,
    GlassInfo glassInfo
) {
    public static InnerPet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InnerPet(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
    public static InnerPet parseFrom(java.util.List<ProtoField> fields) {
        return new InnerPet(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
}
