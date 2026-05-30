// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleFinalBattleP2SummonRsp(
    RetInfo retInfo,
    PetData pet,
    BattlePerformCmd performCmd
) {
    public static ZoneBattleFinalBattleP2SummonRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleFinalBattleP2SummonRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneBattleFinalBattleP2SummonRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleFinalBattleP2SummonRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
