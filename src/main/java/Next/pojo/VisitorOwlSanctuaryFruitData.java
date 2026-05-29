// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisitorOwlSanctuaryFruitData(
    int uin,
    List<OwlSanctuaryFruitData> fruitData
) {
    public static VisitorOwlSanctuaryFruitData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisitorOwlSanctuaryFruitData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitData::parseFrom).toList()
        );
    }
    public static VisitorOwlSanctuaryFruitData parseFrom(java.util.List<ProtoField> fields) {
        return new VisitorOwlSanctuaryFruitData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitData::parseFrom).toList()
        );
    }
}
