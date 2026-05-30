// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmOpenAdventureChapterReq(
    int uin,
    int chapterId
) {
    public static ZoneGmOpenAdventureChapterReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmOpenAdventureChapterReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGmOpenAdventureChapterReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmOpenAdventureChapterReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
