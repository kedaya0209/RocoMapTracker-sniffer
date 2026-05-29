// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleWeatherInfo(
    int weatherType,
    boolean isKeep,
    int areaFuncCfgId
) {
    public static BattleWeatherInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleWeatherInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static BattleWeatherInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleWeatherInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
