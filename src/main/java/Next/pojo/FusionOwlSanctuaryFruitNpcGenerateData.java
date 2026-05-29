// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FusionOwlSanctuaryFruitNpcGenerateData(
    int npcRefreshContentId,
    int areaId,
    int npcId,
    int refreshMaxNum
) {
    public static FusionOwlSanctuaryFruitNpcGenerateData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FusionOwlSanctuaryFruitNpcGenerateData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static FusionOwlSanctuaryFruitNpcGenerateData parseFrom(java.util.List<ProtoField> fields) {
        return new FusionOwlSanctuaryFruitNpcGenerateData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
