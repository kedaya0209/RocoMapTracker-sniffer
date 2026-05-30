// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRewardSeasonAdventureChapterReq(
    int chapterId
) {
    public static ZoneRewardSeasonAdventureChapterReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRewardSeasonAdventureChapterReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneRewardSeasonAdventureChapterReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRewardSeasonAdventureChapterReq(
            Pojos.readInt(fields, 1)
        );
    }
}
