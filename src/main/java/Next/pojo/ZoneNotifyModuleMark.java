// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneNotifyModuleMark(
    long moduleMark
) {
    public static ZoneNotifyModuleMark parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNotifyModuleMark(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneNotifyModuleMark parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNotifyModuleMark(
            Pojos.readLong(fields, 1)
        );
    }
}
