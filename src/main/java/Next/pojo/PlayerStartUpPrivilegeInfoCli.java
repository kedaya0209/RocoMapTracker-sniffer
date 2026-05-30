// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerStartUpPrivilegeInfoCli(
    long cliStartupDay,
    int cliStartupChannel,
    int isFirstStartup
) {
    public static PlayerStartUpPrivilegeInfoCli parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerStartUpPrivilegeInfoCli(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static PlayerStartUpPrivilegeInfoCli parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerStartUpPrivilegeInfoCli(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
