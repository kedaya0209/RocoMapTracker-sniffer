// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerSyncNotify(
    RetInfo retInfo,
    PlayerSyncInfo syncInfo
) {
    public static ZonePlayerSyncNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerSyncNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSyncInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZonePlayerSyncNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerSyncNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSyncInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
