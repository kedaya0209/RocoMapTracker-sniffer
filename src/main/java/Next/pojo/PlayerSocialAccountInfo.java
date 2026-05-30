// Generated from com_player_social_info.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSocialAccountInfo(
    String openid,
    int registerTime,
    int uin
) {
    public static PlayerSocialAccountInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSocialAccountInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerSocialAccountInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSocialAccountInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
