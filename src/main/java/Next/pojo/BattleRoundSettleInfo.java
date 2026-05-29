// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleRoundSettleInfo(
    boolean isEvolutionComplete,
    int worldZoneId,
    List<BattleRoundPetInfo> casterPetInfo,
    List<BattleRoundPetInfo> targetPetInfo,
    int result,
    int evolutionBaseId,
    long battleId,
    int battleRefreshContent,
    int guideType,
    List<BattlerSettleInfo> lastDamageInfo
) {
    public static BattleRoundSettleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoundSettleInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleRoundPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleRoundPetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.BattlerSettleInfo::parseFrom).toList()
        );
    }
    public static BattleRoundSettleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoundSettleInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleRoundPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleRoundPetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5, 0),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.BattlerSettleInfo::parseFrom).toList()
        );
    }
}
