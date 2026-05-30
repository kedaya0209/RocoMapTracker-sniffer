// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetVisitPermissionSettingReq(
    int permissionType
) {
    public static ZoneSetVisitPermissionSettingReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetVisitPermissionSettingReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSetVisitPermissionSettingReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetVisitPermissionSettingReq(
            Pojos.readInt(fields, 1)
        );
    }
}
