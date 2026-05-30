// Generated from dots_label_export.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DotsLabelTag(
    int type,
    int value
) {
    public static DotsLabelTag parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsLabelTag(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static DotsLabelTag parseFrom(java.util.List<ProtoField> fields) {
        return new DotsLabelTag(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
