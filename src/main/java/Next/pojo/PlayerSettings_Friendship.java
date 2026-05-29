// Generated from com_player_settings.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSettings_Friendship(
    boolean canBeSearched,
    boolean canBeSugguested,
    boolean canBeAddFriend,
    boolean canStrangerVisit
) {
    public static PlayerSettings_Friendship parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSettings_Friendship(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static PlayerSettings_Friendship parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSettings_Friendship(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
