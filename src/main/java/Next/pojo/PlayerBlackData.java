// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBlackData(
    int blackUin,
    long blockTime
) {
    public static PlayerBlackData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBlackData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static PlayerBlackData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBlackData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
