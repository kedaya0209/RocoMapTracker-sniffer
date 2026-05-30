// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleCatchPetInfo(
    boolean success,
    int playerId,
    int monsterId,
    int petGid,
    int ballId,
    int catchProb,
    boolean isTechSatisfied,
    GlassInfo glassInfo,
    int exRewardId,
    boolean isQuickCatch
) {
    public static BattleCatchPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleCatchPetInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
    public static BattleCatchPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleCatchPetInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
}
