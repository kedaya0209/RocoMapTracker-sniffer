// Generated from feed_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GridFeedDetailInfo(
    long gridId,
    List<ZoneMagicFeedInfo> magicFeeds,
    List<ZoneFlowerFeedInfo> flowerFeeds,
    List<ZoneMagicFeedInfo> myMagicFeeds,
    List<ZoneMagicFeedInfo> systemMagicFeeds,
    List<ZoneMagicFeedInfo> magicVideos,
    List<ZoneMagicFeedInfo> myMagicVideos
) {
    public static GridFeedDetailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GridFeedDetailInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneFlowerFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList()
        );
    }
    public static GridFeedDetailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GridFeedDetailInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ZoneFlowerFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.ZoneMagicFeedInfo::parseFrom).toList()
        );
    }
}
