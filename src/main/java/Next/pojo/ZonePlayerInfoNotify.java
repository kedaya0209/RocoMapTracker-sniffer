// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerInfoNotify(
    RetInfo retInfo,
    PlayerInfo playerInfo
) {
    public static ZonePlayerInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZonePlayerInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
