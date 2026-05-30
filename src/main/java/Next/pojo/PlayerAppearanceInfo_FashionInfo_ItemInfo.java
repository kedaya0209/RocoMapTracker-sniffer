// Generated from com_appearance.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_FashionInfo_ItemInfo(
    int itemId,
    List<GlassInfo> unlockedGlass,
    List<GlassInfo> claimableGlass,
    GlassInfo defaultGlass
) {
    public static PlayerAppearanceInfo_FashionInfo_ItemInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_FashionInfo_ItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static PlayerAppearanceInfo_FashionInfo_ItemInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_FashionInfo_ItemInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
