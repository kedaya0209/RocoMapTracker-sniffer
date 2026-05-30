// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneNewFashionItemNotify(
    List<Integer> fashionItemIds,
    boolean isDeduct
) {
    public static ZoneNewFashionItemNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNewFashionItemNotify(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneNewFashionItemNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNewFashionItemNotify(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
