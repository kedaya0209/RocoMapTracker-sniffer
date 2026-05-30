// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetAppearanceInfoRsp(
    RetInfo retInfo,
    PlayerAppearanceInfo appearanceInfo
) {
    public static ZoneGetAppearanceInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetAppearanceInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetAppearanceInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetAppearanceInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
