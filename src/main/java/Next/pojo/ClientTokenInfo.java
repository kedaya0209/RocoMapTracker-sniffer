// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientTokenInfo(
    int authType,
    byte[] accessToken,
    byte[] payToken,
    byte[] pf,
    byte[] tpnsToken
) {
    public static ClientTokenInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientTokenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5)
        );
    }
    public static ClientTokenInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ClientTokenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5)
        );
    }
}
