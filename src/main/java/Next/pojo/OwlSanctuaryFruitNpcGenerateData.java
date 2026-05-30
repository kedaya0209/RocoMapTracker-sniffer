// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record OwlSanctuaryFruitNpcGenerateData(
    int npcRefreshContentId,
    int areaId,
    int npcId,
    int refreshMaxNum,
    int owlContentId
) {
    public static OwlSanctuaryFruitNpcGenerateData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryFruitNpcGenerateData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static OwlSanctuaryFruitNpcGenerateData parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryFruitNpcGenerateData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
