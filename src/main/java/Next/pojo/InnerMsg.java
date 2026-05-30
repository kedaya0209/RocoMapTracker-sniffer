// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InnerMsg(
    int innerIntVal1
) {
    public static InnerMsg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InnerMsg(
            Pojos.readInt(fields, 1)
        );
    }
    public static InnerMsg parseFrom(java.util.List<ProtoField> fields) {
        return new InnerMsg(
            Pojos.readInt(fields, 1)
        );
    }
}
