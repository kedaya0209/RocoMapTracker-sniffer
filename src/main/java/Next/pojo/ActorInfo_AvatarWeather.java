// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_AvatarWeather(
    int weatherType,
    int areaFuncCfgId
) {
    public static ActorInfo_AvatarWeather parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AvatarWeather(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ActorInfo_AvatarWeather parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AvatarWeather(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
