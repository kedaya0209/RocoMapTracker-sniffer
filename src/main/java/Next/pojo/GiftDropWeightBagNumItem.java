// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GiftDropWeightBagNumItem(
    int id,
    int num
) {
    public static GiftDropWeightBagNumItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GiftDropWeightBagNumItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static GiftDropWeightBagNumItem parseFrom(java.util.List<ProtoField> fields) {
        return new GiftDropWeightBagNumItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
