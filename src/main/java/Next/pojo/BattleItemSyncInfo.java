// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleItemSyncInfo(
    int itemId,
    int num,
    int remainUseCnt,
    int allowUseCnt,
    int battleUseTimeMax,
    int battleUseTimeRemain
) {
    public static BattleItemSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleItemSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
    public static BattleItemSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleItemSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12)
        );
    }
}
