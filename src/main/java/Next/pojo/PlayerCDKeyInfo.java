// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCDKeyInfo(
    List<String> cdkeyList
) {
    public static PlayerCDKeyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCDKeyInfo(
            Pojos.readStringList(fields, 1)
        );
    }
    public static PlayerCDKeyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCDKeyInfo(
            Pojos.readStringList(fields, 1)
        );
    }
}
