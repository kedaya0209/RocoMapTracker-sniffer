// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneStartUpPrivilegeInfoNotify(
    PlayerStartUpPrivilegeInfoCli startUpPrivilegeInfoCli
) {
    public static ZoneStartUpPrivilegeInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStartUpPrivilegeInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerStartUpPrivilegeInfoCli.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneStartUpPrivilegeInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStartUpPrivilegeInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerStartUpPrivilegeInfoCli.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
