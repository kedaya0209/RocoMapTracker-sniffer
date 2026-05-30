// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_HomePet(
    HomePetInfo homePetInfo
) {
    public static ActorInfo_HomePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_HomePet(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorInfo_HomePet parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_HomePet(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
