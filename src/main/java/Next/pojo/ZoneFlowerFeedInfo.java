// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFlowerFeedInfo(
    long feedId,
    int uin,
    String name,
    int type,
    int createTimestamp,
    int expireTimestamp,
    Position createPos,
    long gridId,
    String extInfo,
    int category
) {
    public static ZoneFlowerFeedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFlowerFeedInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static ZoneFlowerFeedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFlowerFeedInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readLong(fields, 8),
            Pojos.readString(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
