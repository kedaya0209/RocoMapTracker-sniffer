// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHandbookStatChangeNotify(
    List<HandbookRecordCollection> hbColl
) {
    public static ZoneHandbookStatChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHandbookStatChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HandbookRecordCollection::parseFrom).toList()
        );
    }
    public static ZoneHandbookStatChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHandbookStatChangeNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HandbookRecordCollection::parseFrom).toList()
        );
    }
}
