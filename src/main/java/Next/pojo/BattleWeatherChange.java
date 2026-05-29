// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleWeatherChange(
    int skillId,
    int weatherId,
    int weatherExpireRound,
    int castMoment,
    boolean hideTips
) {
    public static BattleWeatherChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleWeatherChange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 3)
        );
    }
    public static BattleWeatherChange parseFrom(java.util.List<ProtoField> fields) {
        return new BattleWeatherChange(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 3)
        );
    }
}
