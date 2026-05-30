// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CDKeyInfo(
    String cdkey,
    boolean used
) {
    public static CDKeyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CDKeyInfo(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static CDKeyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CDKeyInfo(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
