// Generated from com_player_settings.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSettings_UserSubscribe(
    boolean hatchEgg,
    boolean travel,
    boolean debrisFull,
    boolean newActivity,
    boolean friendBattle,
    boolean exchangeEgg,
    boolean friendVisit
) {
    public static PlayerSettings_UserSubscribe parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSettings_UserSubscribe(
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8)
        );
    }
    public static PlayerSettings_UserSubscribe parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSettings_UserSubscribe(
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8)
        );
    }
}
