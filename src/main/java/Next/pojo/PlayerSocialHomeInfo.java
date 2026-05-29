// Generated from com_player_social_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSocialHomeInfo(
    byte[] homeName,
    int homeExperience,
    int homeLevel,
    int roomLevel,
    int homeComfortLevel,
    RoomExpansionInfo roomExpansionInfo
) {
    public static PlayerSocialHomeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSocialHomeInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
    public static PlayerSocialHomeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSocialHomeInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.RoomExpansionInfo.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
}
