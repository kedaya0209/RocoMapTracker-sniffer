// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWishingStarExchangeRsp(
    RetInfo retInfo,
    int exchangeNum,
    PlayerStarLightInfo starLightInfo
) {
    public static ZoneWishingStarExchangeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWishingStarExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerStarLightInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneWishingStarExchangeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWishingStarExchangeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerStarLightInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
