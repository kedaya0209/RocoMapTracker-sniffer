// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThiefInfo(
    int uin
) {
    public static ThiefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThiefInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static ThiefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThiefInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
