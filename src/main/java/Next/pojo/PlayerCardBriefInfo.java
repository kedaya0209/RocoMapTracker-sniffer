// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCardBriefInfo(
    int cardIconSelected,
    int cardLabelFirstSelected,
    int cardLabelLastSelected,
    byte[] cardSignature,
    int cardHandbookCollectNum,
    List<PlayerCardBriefInfo_FavoritePetInfo> cardFavoritePetInfo,
    PlayerCardBriefInfo_AppearanceInfo cardAppearanceInfo,
    int cardMusicId,
    PlayerCardBriefInfo_CollectInfo cardCollectInfo,
    PlayerBusinessCardInfo businessCardInfo,
    int cardFashionBondCollectNum
) {
    public static PlayerCardBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerCardBriefInfo_FavoritePetInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerCardBriefInfo_AppearanceInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerCardBriefInfo_CollectInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerBusinessCardInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12)
        );
    }
    public static PlayerCardBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerCardBriefInfo_FavoritePetInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerCardBriefInfo_AppearanceInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerCardBriefInfo_CollectInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerBusinessCardInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12)
        );
    }
}
