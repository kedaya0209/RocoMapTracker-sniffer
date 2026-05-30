// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleEffectTrigger(
    int casterId,
    int targetId,
    int effectId,
    int result,
    List<Integer> params
) {
    public static BattleEffectTrigger parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleEffectTrigger(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6)
        );
    }
    public static BattleEffectTrigger parseFrom(java.util.List<ProtoField> fields) {
        return new BattleEffectTrigger(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6)
        );
    }
}
