// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMagicFeedInfo(
    long feedId,
    int uin,
    String name,
    int createTimestamp,
    int expireTimestamp,
    int commentNum,
    int attitudeLikeNum,
    int attitudeHugNum,
    int attitudeInspirationNum,
    int attitudePerplexityNum,
    String content,
    Position createPos,
    int cardIconSelected,
    int attitude,
    long gridId,
    String extInfo,
    int category,
    int musicId
) {
    public static ZoneMagicFeedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMagicFeedInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readString(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readString(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
    public static ZoneMagicFeedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMagicFeedInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readString(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readString(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
}
