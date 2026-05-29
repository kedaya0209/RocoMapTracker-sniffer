// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCardInfo(
    int lastNameChangedTime,
    List<PlayerCardInfo_CardItemOwnedInfo> iconOwned,
    List<PlayerCardInfo_CardItemOwnedInfo> skinOwned,
    List<PlayerCardInfo_CardItemOwnedInfo> labelOwned,
    byte[] cachedName
) {
    public static PlayerCardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardInfo(
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerCardInfo_CardItemOwnedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerCardInfo_CardItemOwnedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerCardInfo_CardItemOwnedInfo::parseFrom).toList(),
            Pojos.readBytes(fields, 9)
        );
    }
    public static PlayerCardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardInfo(
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.PlayerCardInfo_CardItemOwnedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.PlayerCardInfo_CardItemOwnedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerCardInfo_CardItemOwnedInfo::parseFrom).toList(),
            Pojos.readBytes(fields, 9)
        );
    }
}
