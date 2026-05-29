// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSettingBriefInfo(
    boolean canBeSearched,
    boolean canBeSugguested,
    boolean canBeAddFriend,
    boolean canStrangerVisit
) {
    public static PlayerSettingBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSettingBriefInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static PlayerSettingBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSettingBriefInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
