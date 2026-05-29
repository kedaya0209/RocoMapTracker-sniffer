// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PvpModeCtl(
    int mode,
    boolean matched,
    int pvpId,
    List<MatchSuccInfo> matchInfos,
    int pkagainCnt,
    List<PetData> welfareTeam,
    int welfareTeamRoleMagicId,
    int welfareEnemyPvpRankStar,
    int welfareEnemyPvpRankOrder,
    String welfareEnemyPvpRankName,
    boolean showEnemyPet
) {
    public static PvpModeCtl parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpModeCtl(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.MatchSuccInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readString(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
    public static PvpModeCtl parseFrom(java.util.List<ProtoField> fields) {
        return new PvpModeCtl(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.MatchSuccInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readString(fields, 11),
            Pojos.readBool(fields, 12)
        );
    }
}
