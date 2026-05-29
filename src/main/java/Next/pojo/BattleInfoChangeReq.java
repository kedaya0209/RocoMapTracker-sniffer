// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleInfoChangeReq(
    int infoType,
    BattleWeatherChangeInfo weatherInfo,
    EnvEnergyInfo envInfo
) {
    public static BattleInfoChangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleInfoChangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleWeatherChangeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.EnvEnergyInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static BattleInfoChangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new BattleInfoChangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleWeatherChangeInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.EnvEnergyInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
