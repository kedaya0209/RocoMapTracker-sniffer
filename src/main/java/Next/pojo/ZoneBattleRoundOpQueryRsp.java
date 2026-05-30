// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleRoundOpQueryRsp(
    RetInfo retInfo,
    List<BattleOpRecord> items,
    List<CliSimpleBattlePet> simplePets
) {
    public static ZoneBattleRoundOpQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleRoundOpQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleOpRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CliSimpleBattlePet::parseFrom).toList()
        );
    }
    public static ZoneBattleRoundOpQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleRoundOpQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleOpRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CliSimpleBattlePet::parseFrom).toList()
        );
    }
}
