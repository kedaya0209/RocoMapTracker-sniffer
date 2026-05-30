// Generated from com_player_settings.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ObserveBattle(
    boolean deny,
    int mode
) {
    public static ObserveBattle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ObserveBattle(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ObserveBattle parseFrom(java.util.List<ProtoField> fields) {
        return new ObserveBattle(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
