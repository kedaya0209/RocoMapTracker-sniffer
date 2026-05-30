// Generated from com_player_settings.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSettings_Pvp(
    ObserveBattle observeBattle,
    boolean openRank
) {
    public static PlayerSettings_Pvp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSettings_Pvp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ObserveBattle.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
    public static PlayerSettings_Pvp parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSettings_Pvp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ObserveBattle.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2)
        );
    }
}
