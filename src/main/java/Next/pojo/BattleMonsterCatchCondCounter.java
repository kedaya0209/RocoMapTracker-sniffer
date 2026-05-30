// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleMonsterCatchCondCounter(
    int conditionId,
    int triggerCnt,
    boolean isTriggered,
    boolean needSyncClient
) {
    public static BattleMonsterCatchCondCounter parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleMonsterCatchCondCounter(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static BattleMonsterCatchCondCounter parseFrom(java.util.List<ProtoField> fields) {
        return new BattleMonsterCatchCondCounter(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
