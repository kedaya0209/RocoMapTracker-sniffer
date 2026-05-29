// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerShinyPetDayInfoChangeNty(
    PlayerShinyPetDayInfo info
) {
    public static ZonePlayerShinyPetDayInfoChangeNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerShinyPetDayInfoChangeNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerShinyPetDayInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZonePlayerShinyPetDayInfoChangeNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerShinyPetDayInfoChangeNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerShinyPetDayInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
