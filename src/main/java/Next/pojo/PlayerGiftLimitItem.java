// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerGiftLimitItem(
    int id,
    int cnt,
    int lastUpdateTime
) {
    public static PlayerGiftLimitItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerGiftLimitItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerGiftLimitItem parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerGiftLimitItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
