// Generated from com_player_settings.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSettings_PersonalizedRecommendations(
    boolean friendPr
) {
    public static PlayerSettings_PersonalizedRecommendations parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSettings_PersonalizedRecommendations(
            Pojos.readBool(fields, 1)
        );
    }
    public static PlayerSettings_PersonalizedRecommendations parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSettings_PersonalizedRecommendations(
            Pojos.readBool(fields, 1)
        );
    }
}
