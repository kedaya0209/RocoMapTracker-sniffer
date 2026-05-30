// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClimbChapterNotify(
    ClimbChapterItem chapterItem
) {
    public static ZoneClimbChapterNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClimbChapterNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClimbChapterItem.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneClimbChapterNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClimbChapterNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClimbChapterItem.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
