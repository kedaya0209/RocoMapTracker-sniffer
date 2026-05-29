// Generated from com_scene.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record OwlSanctuaryFruitData(
    int fruitId,
    int fruitGid,
    boolean isActive,
    List<OwlSanctuaryFruitNpcGenerateData> npcGenerateData,
    int fruitActiveTimestamp,
    int slotActiveTimestamp,
    List<Integer> npcIds
) {
    public static OwlSanctuaryFruitData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OwlSanctuaryFruitData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.OwlSanctuaryFruitNpcGenerateData::parseFrom).toList(),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readIntList(fields, 11)
        );
    }
    public static OwlSanctuaryFruitData parseFrom(java.util.List<ProtoField> fields) {
        return new OwlSanctuaryFruitData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.OwlSanctuaryFruitNpcGenerateData::parseFrom).toList(),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readIntList(fields, 11)
        );
    }
}
