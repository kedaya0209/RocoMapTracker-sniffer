// Generated from com_appearance.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_FashionInfo_WardrobeItem(
    int wearingItemId,
    GlassInfo wearingGlass
) {
    public static PlayerAppearanceInfo_FashionInfo_WardrobeItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_FashionInfo_WardrobeItem(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static PlayerAppearanceInfo_FashionInfo_WardrobeItem parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_FashionInfo_WardrobeItem(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
