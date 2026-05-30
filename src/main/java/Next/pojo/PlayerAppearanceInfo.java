// Generated from com_appearance.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo(
    PlayerAppearanceInfo_FashionInfo fashionInfo,
    PlayerAppearanceInfo_SalonInfo salonInfo,
    PlayerAppearanceInfo_BondInfo fashionBondInfo
) {
    public static PlayerAppearanceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_SalonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerAppearanceInfo_BondInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static PlayerAppearanceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_SalonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerAppearanceInfo_BondInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
