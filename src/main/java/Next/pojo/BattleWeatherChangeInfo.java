// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleWeatherChangeInfo(
    List<Integer> type,
    List<Integer> layer
) {
    public static BattleWeatherChangeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleWeatherChangeInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static BattleWeatherChangeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleWeatherChangeInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
