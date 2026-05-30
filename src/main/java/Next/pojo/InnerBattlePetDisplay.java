// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InnerBattlePetDisplay(
    long ownerObjId,
    int confId,
    int nature,
    int baseConfId,
    int height,
    int weight,
    int mutationType,
    GlassInfo glassInfo,
    long npcObjId,
    int battlePetId
) {
    public static InnerBattlePetDisplay parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InnerBattlePetDisplay(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static InnerBattlePetDisplay parseFrom(java.util.List<ProtoField> fields) {
        return new InnerBattlePetDisplay(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
