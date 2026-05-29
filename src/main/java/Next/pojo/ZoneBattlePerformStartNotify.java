// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattlePerformStartNotify(
    BattlePerformCmd performCmd,
    BattleRoundSettleInfo settleInfo,
    RetInfo retInfo
) {
    public static ZoneBattlePerformStartNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattlePerformStartNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundSettleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneBattlePerformStartNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattlePerformStartNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleRoundSettleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
