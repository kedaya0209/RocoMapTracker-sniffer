// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUpdateFashionInfoNotify(
    PlayerAppearanceInfo_FashionInfo fashionInfo
) {
    public static ZoneUpdateFashionInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpdateFashionInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneUpdateFashionInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpdateFashionInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerAppearanceInfo_FashionInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
