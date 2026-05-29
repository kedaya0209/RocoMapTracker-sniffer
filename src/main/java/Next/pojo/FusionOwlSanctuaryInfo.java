// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record FusionOwlSanctuaryInfo(
    int owlSanctuaryContentId,
    int lastRefreshTimestamp,
    List<FusionOwlSanctuaryFruitNpcGenerateData> npcGenerateDatas
) {
    public static FusionOwlSanctuaryInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FusionOwlSanctuaryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FusionOwlSanctuaryFruitNpcGenerateData::parseFrom).toList()
        );
    }
    public static FusionOwlSanctuaryInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FusionOwlSanctuaryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.FusionOwlSanctuaryFruitNpcGenerateData::parseFrom).toList()
        );
    }
}
