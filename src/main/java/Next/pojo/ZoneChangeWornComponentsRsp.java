// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChangeWornComponentsRsp(
    RetInfo retInfo,
    PlayerAppearanceInfo_FashionInfo_SuitInfo suitInfo
) {
    public static ZoneChangeWornComponentsRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChangeWornComponentsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneChangeWornComponentsRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChangeWornComponentsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
