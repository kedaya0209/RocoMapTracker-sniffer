// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleRoundStartNotify(
    int stateType,
    BattleStateInfo stateInfo,
    BattlePerformCmd performCmd,
    AiExtraData aiExtraData,
    boolean hasNpcDelay,
    int guideId
) {
    public static ZoneBattleRoundStartNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleRoundStartNotify(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleStateInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.AiExtraData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneBattleRoundStartNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleRoundStartNotify(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleStateInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattlePerformCmd.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.AiExtraData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
