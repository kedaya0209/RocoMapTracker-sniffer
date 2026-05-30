// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTextNotify(
    CommonTextInfo textInfo
) {
    public static ZoneTextNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTextNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CommonTextInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneTextNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTextNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CommonTextInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
