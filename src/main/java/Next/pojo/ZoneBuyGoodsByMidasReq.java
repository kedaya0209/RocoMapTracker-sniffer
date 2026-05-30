// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBuyGoodsByMidasReq(
    int goodsId,
    int type,
    ClientTokenInfo tokenInfo,
    int shopId,
    long version
) {
    public static ZoneBuyGoodsByMidasReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBuyGoodsByMidasReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientTokenInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static ZoneBuyGoodsByMidasReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBuyGoodsByMidasReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ClientTokenInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
