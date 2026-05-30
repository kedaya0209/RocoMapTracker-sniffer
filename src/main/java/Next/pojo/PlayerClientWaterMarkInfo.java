// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerClientWaterMarkInfo(
    boolean closeWatermark,
    long endTime
) {
    public static PlayerClientWaterMarkInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerClientWaterMarkInfo(
            Pojos.readBool(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static PlayerClientWaterMarkInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerClientWaterMarkInfo(
            Pojos.readBool(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
