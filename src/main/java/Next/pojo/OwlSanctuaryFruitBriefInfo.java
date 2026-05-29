// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OwlSanctuaryFruitBriefInfo(
    int fruitId,
    List<Integer> npcId,
    int fruitActiveTimestamp,
    int slotActiveTimestamp
) {
    public static OwlSanctuaryFruitBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryFruitBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static OwlSanctuaryFruitBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryFruitBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
