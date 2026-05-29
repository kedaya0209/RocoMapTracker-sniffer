// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetPlayerCardAppearanceInfoReq(
    PlayerCardBriefInfo_AppearanceInfo appearanceInfo
) {
    public static ZoneSetPlayerCardAppearanceInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerCardAppearanceInfoReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardBriefInfo_AppearanceInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSetPlayerCardAppearanceInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerCardAppearanceInfoReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerCardBriefInfo_AppearanceInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
