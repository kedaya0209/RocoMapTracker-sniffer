// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFashionSuitsLevelUpRsp(
    RetInfo retInfo,
    PlayerAppearanceInfo_FashionInfo_SuitInfo suitInfo
) {
    public static ZoneFashionSuitsLevelUpRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFashionSuitsLevelUpRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneFashionSuitsLevelUpRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFashionSuitsLevelUpRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo_SuitInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
