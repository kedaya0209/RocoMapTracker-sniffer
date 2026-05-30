// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRewardAdventureChapterReq(
    int chapterId
) {
    public static ZoneRewardAdventureChapterReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRewardAdventureChapterReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneRewardAdventureChapterReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRewardAdventureChapterReq(
            Pojos.readInt(fields, 1)
        );
    }
}
