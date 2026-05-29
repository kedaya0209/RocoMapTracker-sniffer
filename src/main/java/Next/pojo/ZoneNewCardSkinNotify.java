// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneNewCardSkinNotify(
    PlayerCardInfo_CardItemOwnedInfo cardItemInfo
) {
    public static ZoneNewCardSkinNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNewCardSkinNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardInfo_CardItemOwnedInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneNewCardSkinNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNewCardSkinNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardInfo_CardItemOwnedInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
