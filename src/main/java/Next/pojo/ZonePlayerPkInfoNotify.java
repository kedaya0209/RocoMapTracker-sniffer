// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerPkInfoNotify(
    PlayerPkInfo pkInfo
) {
    public static ZonePlayerPkInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerPkInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPkInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZonePlayerPkInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerPkInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPkInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
