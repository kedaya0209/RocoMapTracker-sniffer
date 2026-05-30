// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerStartUpPrivilegeInfo(
    long cliStartupDay,
    int cliStartupChannel
) {
    public static PlayerStartUpPrivilegeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerStartUpPrivilegeInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerStartUpPrivilegeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerStartUpPrivilegeInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
