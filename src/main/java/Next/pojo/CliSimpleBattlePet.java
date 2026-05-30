// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CliSimpleBattlePet(
    int petId,
    int ownerUin,
    int petConfId,
    int petBaseId,
    String name,
    int mutation,
    int side,
    int level,
    GlassInfo glassInfo
) {
    public static CliSimpleBattlePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CliSimpleBattlePet(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static CliSimpleBattlePet parseFrom(java.util.List<ProtoField> fields) {
        return new CliSimpleBattlePet(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
