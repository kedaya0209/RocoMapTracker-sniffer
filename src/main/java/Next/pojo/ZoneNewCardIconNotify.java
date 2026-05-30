// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneNewCardIconNotify(
    PlayerCardInfo_CardItemOwnedInfo cardItemInfo
) {
    public static ZoneNewCardIconNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNewCardIconNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardInfo_CardItemOwnedInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneNewCardIconNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNewCardIconNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardInfo_CardItemOwnedInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
