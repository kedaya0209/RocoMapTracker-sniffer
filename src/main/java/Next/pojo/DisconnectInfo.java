// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DisconnectInfo(
    byte[] systemHardware,
    byte[] channel
) {
    public static DisconnectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DisconnectInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static DisconnectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DisconnectInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
