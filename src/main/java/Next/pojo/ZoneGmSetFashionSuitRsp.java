// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmSetFashionSuitRsp(
    RetInfo retInfo,
    PlayerAppearanceInfo_FashionInfo fashionInfo
) {
    public static ZoneGmSetFashionSuitRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSetFashionSuitRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGmSetFashionSuitRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSetFashionSuitRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
