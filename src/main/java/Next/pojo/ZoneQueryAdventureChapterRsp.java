// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryAdventureChapterRsp(
    RetInfo retInfo,
    int chapterId,
    boolean rewarded,
    int regionId
) {
    public static ZoneQueryAdventureChapterRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryAdventureChapterRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneQueryAdventureChapterRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryAdventureChapterRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
