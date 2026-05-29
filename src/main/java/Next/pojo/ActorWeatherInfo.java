// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorWeatherInfo(
    List<AreaWeather> weatherList
) {
    public static ActorWeatherInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorWeatherInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AreaWeather::parseFrom).toList()
        );
    }
    public static ActorWeatherInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorWeatherInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AreaWeather::parseFrom).toList()
        );
    }
}
