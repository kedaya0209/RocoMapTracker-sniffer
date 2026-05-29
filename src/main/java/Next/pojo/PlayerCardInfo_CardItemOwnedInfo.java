// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCardInfo_CardItemOwnedInfo(
    int cardItemId,
    int cardItemGetTimestamp,
    int cardItemNum
) {
    public static PlayerCardInfo_CardItemOwnedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardInfo_CardItemOwnedInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerCardInfo_CardItemOwnedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardInfo_CardItemOwnedInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
