// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_SocialInfoReporter(
    AvatarSocialInfo socialInfo
) {
    public static ActorCompData_SocialInfoReporter parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_SocialInfoReporter(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.AvatarSocialInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ActorCompData_SocialInfoReporter parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_SocialInfoReporter(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.AvatarSocialInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
