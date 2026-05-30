// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattlePrePlayNotify(
    BattlePerformCmd performCmd,
    BattleRoundSettleInfo settleInfo
) {
    public static ZoneBattlePrePlayNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattlePrePlayNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundSettleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneBattlePrePlayNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattlePrePlayNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundSettleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
