// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleFieldItem(
    int battleId,
    boolean finish,
    List<Integer> factions
) {
    public static BattleFieldItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleFieldItem(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static BattleFieldItem parseFrom(java.util.List<ProtoField> fields) {
        return new BattleFieldItem(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
