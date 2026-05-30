// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TeamBattleResultInfo(
    int contentCfgId,
    int winTimes,
    TeamBattleInfo battleInfo,
    TeamBattleBossInfo bossInfo,
    long lastCompletePerformTime
) {
    public static TeamBattleResultInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TeamBattleResultInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.TeamBattleInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.TeamBattleBossInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6)
        );
    }
    public static TeamBattleResultInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TeamBattleResultInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.TeamBattleInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.TeamBattleBossInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6)
        );
    }
}
