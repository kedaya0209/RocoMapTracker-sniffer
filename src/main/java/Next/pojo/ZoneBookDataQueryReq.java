// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBookDataQueryReq(
    int bookType
) {
    public static ZoneBookDataQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBookDataQueryReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static ZoneBookDataQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBookDataQueryReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
