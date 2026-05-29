// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SummonerInfo(
    List<ChampionInfo> skinList,
    int recentlyUsedChampion,
    int recentlyJoinedTeam
) {
    public static SummonerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SummonerInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChampionInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SummonerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SummonerInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChampionInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
