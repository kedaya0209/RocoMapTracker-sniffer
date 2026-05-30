// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TeamBattleBossInfo(
    int catchState,
    int catchBallNum,
    int bossShiny,
    PetData boss,
    int tempLeaveTime,
    long lastCatchTime,
    int prevGuaranteeRate,
    GlassInfo glassInfo,
    int ticketId,
    int ticketNum
) {
    public static TeamBattleBossInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TeamBattleBossInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static TeamBattleBossInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TeamBattleBossInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
