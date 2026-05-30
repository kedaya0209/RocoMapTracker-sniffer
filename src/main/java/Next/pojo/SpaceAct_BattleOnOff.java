// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_BattleOnOff(
    long actorId,
    boolean onOrOff,
    SvrAISyncCommonInfo syncCommonInfo
) {
    public static SpaceAct_BattleOnOff parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_BattleOnOff(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static SpaceAct_BattleOnOff parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_BattleOnOff(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
