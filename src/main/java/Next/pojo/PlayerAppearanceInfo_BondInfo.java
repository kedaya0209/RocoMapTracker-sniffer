// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_BondInfo(
    List<FashionBondItem> fashionBondItem
) {
    public static PlayerAppearanceInfo_BondInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_BondInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FashionBondItem::parseFrom).toList()
        );
    }
    public static PlayerAppearanceInfo_BondInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_BondInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FashionBondItem::parseFrom).toList()
        );
    }
}
