// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneStarLightInfoNotify(
    int incrementStarLightNum,
    PlayerStarLightInfo starLightInfo,
    boolean isShareFromWildNoBattle
) {
    public static ZoneStarLightInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStarLightInfoNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerStarLightInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneStarLightInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStarLightInfoNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerStarLightInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
}
