// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleSupplyPetPlayerInfo(
    int playerId,
    List<BattleSupplyPetInfo> petInfos
) {
    public static BattleSupplyPetPlayerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSupplyPetPlayerInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleSupplyPetInfo::parseFrom).toList()
        );
    }
    public static BattleSupplyPetPlayerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSupplyPetPlayerInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleSupplyPetInfo::parseFrom).toList()
        );
    }
}
