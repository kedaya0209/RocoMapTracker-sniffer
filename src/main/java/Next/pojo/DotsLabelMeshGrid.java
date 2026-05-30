// Generated from dots_label_export.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DotsLabelMeshGrid(
    int x,
    int y,
    List<DotsLabelTag> tagList
) {
    public static DotsLabelMeshGrid parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsLabelMeshGrid(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DotsLabelTag::parseFrom).toList()
        );
    }
    public static DotsLabelMeshGrid parseFrom(java.util.List<ProtoField> fields) {
        return new DotsLabelMeshGrid(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DotsLabelTag::parseFrom).toList()
        );
    }
}
