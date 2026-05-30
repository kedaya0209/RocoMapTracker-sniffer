// Generated from com_pet_team.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RecommendPetTeamInfo(
    SharedPetTeamInfo petTeamInfo,
    String petTeamShareId,
    String playerName,
    String playerHeadpic,
    int petLevel,
    String teamName,
    int teamId
) {
    public static RecommendPetTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecommendPetTeamInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static RecommendPetTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new RecommendPetTeamInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SharedPetTeamInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
