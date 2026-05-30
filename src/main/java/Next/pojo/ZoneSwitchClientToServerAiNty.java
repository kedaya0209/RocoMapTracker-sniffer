// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSwitchClientToServerAiNty(
    List<Long> actorList
) {
    public static ZoneSwitchClientToServerAiNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSwitchClientToServerAiNty(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneSwitchClientToServerAiNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSwitchClientToServerAiNty(
            Pojos.readLongList(fields, 1)
        );
    }
}
