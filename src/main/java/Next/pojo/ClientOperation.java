// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientOperation(
    long operatorId,
    int operatorType,
    PetActionSyncInfo petActionInfo,
    AimSyncInfo aimInfo,
    NpcActionSyncInfo npcActionInfo,
    CatchPetSyncInfo catchInfo,
    PlayerPerformSyncInfo playerPerformInfo,
    PlayerCinematicSyncInfo cinematicInfo,
    PlayerMovieSyncInfo movieInfo,
    PlayerDialogueSyncInfo dialogueInfo
) {
    public static ClientOperation parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientOperation(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 8, 0),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PetActionSyncInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.AimSyncInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.NpcActionSyncInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.CatchPetSyncInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerPerformSyncInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerCinematicSyncInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerMovieSyncInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PlayerDialogueSyncInfo.parseFrom(Pojos.readMessage(fields, 17)) : null
        );
    }
    public static ClientOperation parseFrom(java.util.List<ProtoField> fields) {
        return new ClientOperation(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 8, 0),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PetActionSyncInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.AimSyncInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.NpcActionSyncInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.CatchPetSyncInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.PlayerPerformSyncInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PlayerCinematicSyncInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PlayerMovieSyncInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readMessage(fields, 17) != null ? Next.pojo.PlayerDialogueSyncInfo.parseFrom(Pojos.readMessage(fields, 17)) : null
        );
    }
}
