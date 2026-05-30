// Generated from client.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HasP2Win(
    long HasWin
) {
    public static HasP2Win parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HasP2Win(
            Pojos.readLong(fields, 1)
        );
    }
    public static HasP2Win parseFrom(java.util.List<ProtoField> fields) {
        return new HasP2Win(
            Pojos.readLong(fields, 1)
        );
    }
}
