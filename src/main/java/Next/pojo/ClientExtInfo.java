// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientExtInfo(
    int bagItemUsePage
) {
    public static ClientExtInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientExtInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static ClientExtInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ClientExtInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
