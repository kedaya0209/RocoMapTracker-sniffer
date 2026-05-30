// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleNotifyPerform(
    int notifyType,
    List<Integer> data,
    String tipsId,
    List<String> params,
    int uin
) {
    public static BattleNotifyPerform parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleNotifyPerform(
            Pojos.readInt(fields, 1, 0),
            Pojos.readIntList(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readStringList(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static BattleNotifyPerform parseFrom(java.util.List<ProtoField> fields) {
        return new BattleNotifyPerform(
            Pojos.readInt(fields, 1, 0),
            Pojos.readIntList(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readStringList(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
