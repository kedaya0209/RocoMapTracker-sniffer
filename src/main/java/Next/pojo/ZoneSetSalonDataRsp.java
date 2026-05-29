// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetSalonDataRsp(
    RetInfo retInfo,
    PlayerAppearanceInfo_SalonInfo salonInfo
) {
    public static ZoneSetSalonDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetSalonDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_SalonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSetSalonDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetSalonDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerAppearanceInfo_SalonInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
