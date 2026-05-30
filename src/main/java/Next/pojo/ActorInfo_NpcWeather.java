// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_NpcWeather(
    int weatherType
) {
    public static ActorInfo_NpcWeather parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcWeather(
            Pojos.readInt(fields, 1)
        );
    }
    public static ActorInfo_NpcWeather parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcWeather(
            Pojos.readInt(fields, 1)
        );
    }
}
