// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleBuffChange(
    int casterId,
    int targetId,
    int buffId,
    int type,
    BattleBuffInfo buffInfo
) {
    public static BattleBuffChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleBuffChange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.BattleBuffInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
    public static BattleBuffChange parseFrom(java.util.List<ProtoField> fields) {
        return new BattleBuffChange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.BattleBuffInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
}
