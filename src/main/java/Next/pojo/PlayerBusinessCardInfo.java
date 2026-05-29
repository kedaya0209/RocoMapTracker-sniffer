// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBusinessCardInfo(
    String curCard,
    String curCardUrl,
    int applyChangeTime,
    String lastCard,
    String lastCardUrl,
    int applyDailyChanges,
    int photoUploadTime,
    int photoUploadCounts
) {
    public static PlayerBusinessCardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBusinessCardInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static PlayerBusinessCardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBusinessCardInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
