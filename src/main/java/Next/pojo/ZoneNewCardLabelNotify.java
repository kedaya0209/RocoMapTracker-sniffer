// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneNewCardLabelNotify(
    PlayerCardInfo_CardItemOwnedInfo cardItemInfo
) {
    public static ZoneNewCardLabelNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNewCardLabelNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardInfo_CardItemOwnedInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneNewCardLabelNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNewCardLabelNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardInfo_CardItemOwnedInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
