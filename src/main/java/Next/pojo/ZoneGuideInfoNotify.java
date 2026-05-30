// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGuideInfoNotify(
    List<GuideGroup> guideInfo
) {
    public static ZoneGuideInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGuideInfoNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GuideGroup::parseFrom).toList()
        );
    }
    public static ZoneGuideInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGuideInfoNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GuideGroup::parseFrom).toList()
        );
    }
}
