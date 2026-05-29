// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Weather(
    ActorWeatherInfo weatherInfo,
    List<AreaWeatherInfo> areaWeatherInfos,
    BattleWeatherInfo battleWeatherInfo,
    int nightmareWeather,
    int globalWeather,
    int prePvpWeather,
    String gamecfgVer,
    int caveCfgId
) {
    public static ActorCompData_Weather parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Weather(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorWeatherInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.AreaWeatherInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleWeatherInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 9)
        );
    }
    public static ActorCompData_Weather parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Weather(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorWeatherInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.AreaWeatherInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleWeatherInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readInt(fields, 9)
        );
    }
}
