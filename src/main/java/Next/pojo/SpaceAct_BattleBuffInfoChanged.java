// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_BattleBuffInfoChanged(
    long actorId,
    List<BattleBuffBrefInfo> buffInfo
) {
    public static SpaceAct_BattleBuffInfoChanged parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_BattleBuffInfoChanged(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_BattleBuffInfoChanged parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_BattleBuffInfoChanged(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList()
        );
    }
}
