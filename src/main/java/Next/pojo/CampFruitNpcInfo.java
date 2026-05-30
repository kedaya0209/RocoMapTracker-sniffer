// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CampFruitNpcInfo(
    int campContentId,
    List<OwlSanctuaryFruitNpcInfo> owlSanctuaryFruitNpcInfo
) {
    public static CampFruitNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CampFruitNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitNpcInfo::parseFrom).toList()
        );
    }
    public static CampFruitNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CampFruitNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.OwlSanctuaryFruitNpcInfo::parseFrom).toList()
        );
    }
}
