// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NotifyMsg(
    DisconnectInfo disInfo
) {
    public static NotifyMsg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NotifyMsg(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.DisconnectInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static NotifyMsg parseFrom(java.util.List<ProtoField> fields) {
        return new NotifyMsg(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.DisconnectInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
