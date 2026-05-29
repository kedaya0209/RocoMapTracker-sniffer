// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetPlaceRsp(
    RetInfo retInfo,
    HomePetInfo homePetInfo
) {
    public static ZoneHomePetPlaceRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetPlaceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneHomePetPlaceRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetPlaceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HomePetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
