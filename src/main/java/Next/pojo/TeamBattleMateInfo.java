// Generated from com_team_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TeamBattleMateInfo(
    int uin,
    int petGid,
    int petCfgId,
    int mutationType,
    int petLv,
    int prepareState,
    int npcId,
    int helperId,
    int teamIdx,
    List<Integer> petCfgIds,
    GlassInfo glassInfo
) {
    public static TeamBattleMateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TeamBattleMateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 10),
            Pojos.readIntList(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
    public static TeamBattleMateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TeamBattleMateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 10),
            Pojos.readIntList(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 12)) : null
        );
    }
}
