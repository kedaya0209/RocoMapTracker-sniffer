// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PvpFightHis(
    PlayerBriefInfo enemy,
    BattleFashionInfo enemyFashion,
    PvpNpcInfo npcEnemy,
    int pvpRankStar,
    int pvpRankOrder,
    int result,
    List<PvpFightHis_PetInfo> petInfo,
    List<PvpFightHis_PetInfo> petInfoSelf,
    int pvpRankStarSelf,
    int pvpRankOrderSelf,
    int startTime
) {
    public static PvpFightHis parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpFightHis(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PvpNpcInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PvpFightHis_PetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.PvpFightHis_PetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static PvpFightHis parseFrom(java.util.List<ProtoField> fields) {
        return new PvpFightHis(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleFashionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PvpNpcInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PvpFightHis_PetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.PvpFightHis_PetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
