// Generated from com_appearance.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerAppearanceInfo_FashionInfo_InitRole(
    int fashionItemId,
    int fashionSuitId
) {
    public static PlayerAppearanceInfo_FashionInfo_InitRole parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAppearanceInfo_FashionInfo_InitRole(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerAppearanceInfo_FashionInfo_InitRole parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAppearanceInfo_FashionInfo_InitRole(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
