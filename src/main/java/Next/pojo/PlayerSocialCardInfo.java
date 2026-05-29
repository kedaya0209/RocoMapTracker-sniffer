// Generated from com_player_social_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSocialCardInfo(
    byte[] signature,
    int cardSkinSelected,
    int cardIconSelected,
    int cardLabelFirstSelected,
    int cardLabelLastSelected,
    int cardHandbookCollectNum,
    int cardMusicId,
    String cardBussinessCardUrl
) {
    public static PlayerSocialCardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSocialCardInfo(
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readString(fields, 28)
        );
    }
    public static PlayerSocialCardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSocialCardInfo(
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readString(fields, 28)
        );
    }
}
