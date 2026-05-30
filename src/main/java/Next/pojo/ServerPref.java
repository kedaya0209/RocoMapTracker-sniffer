// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ServerPref(
    int intValue,
    List<Integer> listValue,
    byte[] strValue,
    int key
) {
    public static ServerPref parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ServerPref(
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ServerPref parseFrom(java.util.List<ProtoField> fields) {
        return new ServerPref(
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
