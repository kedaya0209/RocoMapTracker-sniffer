// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneLogoutReq(
    int uin,
    ClientDevInfo devInfo,
    boolean isNotifyCli
) {
    public static ZoneLogoutReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneLogoutReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ClientDevInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneLogoutReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneLogoutReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ClientDevInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3)
        );
    }
}
