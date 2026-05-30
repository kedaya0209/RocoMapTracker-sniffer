// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePvpHistoryDataNotify(
    PlayerPvpHisCli pvpHisCli
) {
    public static ZonePvpHistoryDataNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePvpHistoryDataNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPvpHisCli.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZonePvpHistoryDataNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePvpHistoryDataNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerPvpHisCli.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
