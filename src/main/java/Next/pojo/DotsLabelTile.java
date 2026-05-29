// Generated from dots_label_export.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DotsLabelTile(
    int x,
    int y,
    List<DotsLabelMeshGrid> gridList
) {
    public static DotsLabelTile parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsLabelTile(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DotsLabelMeshGrid::parseFrom).toList()
        );
    }
    public static DotsLabelTile parseFrom(java.util.List<ProtoField> fields) {
        return new DotsLabelTile(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DotsLabelMeshGrid::parseFrom).toList()
        );
    }
}
