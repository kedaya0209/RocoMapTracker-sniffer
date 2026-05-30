// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneShopGetInfoReq(
    int shopId
) {
    public static ZoneShopGetInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneShopGetInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneShopGetInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneShopGetInfoReq(
            Pojos.readInt(fields, 1)
        );
    }
}
