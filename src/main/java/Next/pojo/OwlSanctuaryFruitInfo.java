// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OwlSanctuaryFruitInfo(
    List<OwlSanctuaryFruitData> fruitData,
    boolean isInitFruitSet,
    List<VisitorOwlSanctuaryFruitData> visitorFruitData
) {
    public static OwlSanctuaryFruitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryFruitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.OwlSanctuaryFruitData::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.VisitorOwlSanctuaryFruitData::parseFrom).toList()
        );
    }
    public static OwlSanctuaryFruitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryFruitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.OwlSanctuaryFruitData::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.VisitorOwlSanctuaryFruitData::parseFrom).toList()
        );
    }
}
