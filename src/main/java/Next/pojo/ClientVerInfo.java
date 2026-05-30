// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientVerInfo(
    int cliVersion,
    int cliResVersion,
    int cliCfgVersion,
    String appVersion,
    String resVersion
) {
    public static ClientVerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientVerInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5)
        );
    }
    public static ClientVerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ClientVerInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5)
        );
    }
}
