// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneModifyBagListSortReq(
    int itemType,
    int sortType
) {
    public static ZoneModifyBagListSortReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneModifyBagListSortReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneModifyBagListSortReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneModifyBagListSortReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
