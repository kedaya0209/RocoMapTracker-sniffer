// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBookDataChangeNty(
    boolean isNew,
    BookData bookData
) {
    public static ZoneBookDataChangeNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBookDataChangeNty(
            Pojos.readBool(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BookData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneBookDataChangeNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBookDataChangeNty(
            Pojos.readBool(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BookData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
