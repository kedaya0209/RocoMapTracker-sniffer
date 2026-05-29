// Generated from dots_label_export.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DotsLabelExport(
    int tileX,
    int tileY,
    List<DotsLabelTile> tileList
) {
    public static DotsLabelExport parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DotsLabelExport(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DotsLabelTile::parseFrom).toList()
        );
    }
    public static DotsLabelExport parseFrom(java.util.List<ProtoField> fields) {
        return new DotsLabelExport(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.DotsLabelTile::parseFrom).toList()
        );
    }
}
