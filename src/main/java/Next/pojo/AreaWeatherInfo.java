// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AreaWeatherInfo(
    int areaFuncCfgId,
    int weatherType,
    long timeoutTime,
    long pauseTime,
    int weatherBeforePause
) {
    public static AreaWeatherInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AreaWeatherInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static AreaWeatherInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AreaWeatherInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
