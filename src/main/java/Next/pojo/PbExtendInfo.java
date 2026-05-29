// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PbExtendInfo(
    int clanBattleTimes,
    int clanScore,
    int chosedTitleId,
    int clanLogo,
    byte[] clanName,
    PlayerTitleExtendInfo chosedTitleExtendInfo,
    int rateLevel
) {
    public static PbExtendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PbExtendInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerTitleExtendInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8)
        );
    }
    public static PbExtendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PbExtendInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.PlayerTitleExtendInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8)
        );
    }
}
