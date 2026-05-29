// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleCatchConfirmRsp(
    RetInfo retInfo,
    int baseBallNum,
    List<BeastBattleAchieves> achieves,
    int bossShiny,
    List<BattleItemInfo> items,
    int degeneratedBossBaseId,
    PetData bossData
) {
    public static ZoneBattleCatchConfirmRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleCatchConfirmRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BeastBattleAchieves::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
    public static ZoneBattleCatchConfirmRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleCatchConfirmRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BeastBattleAchieves::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 7)) : null
        );
    }
}
