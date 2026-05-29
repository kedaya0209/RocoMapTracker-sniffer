// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneLoginRsp(
    RetInfo retInfo,
    PlayerInfo playerInfo,
    long svrTime,
    boolean needReconnect,
    BanInfo banInfo,
    PlayerSecLightFeatureData featureData,
    int svrTimeZone
) {
    public static ZoneLoginRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneLoginRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerSecLightFeatureData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9)
        );
    }
    public static ZoneLoginRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneLoginRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerSecLightFeatureData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9)
        );
    }
}
