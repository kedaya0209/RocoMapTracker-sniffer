// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OwlSanctuaryFruitNpcInfo(
    int owlSanctuaryContentId,
    List<Integer> npcId
) {
    public static OwlSanctuaryFruitNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryFruitNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static OwlSanctuaryFruitNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryFruitNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
