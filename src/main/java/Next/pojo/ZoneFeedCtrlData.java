// Generated from feed_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedCtrlData(
    int uin,
    int lastAttitudeTimestamp,
    int lastMagicFeedTimestamp,
    int todayMagicFeedCount,
    int lastFlowerFeedTimestamp,
    int todayFlowerFeedCount,
    int dailyMagicFeedCount,
    FeedVideoUploadInfo videoUploadInfo
) {
    public static ZoneFeedCtrlData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedCtrlData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.FeedVideoUploadInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
    public static ZoneFeedCtrlData parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedCtrlData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.FeedVideoUploadInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
}
