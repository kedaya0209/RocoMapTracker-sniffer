// Generated from com_scene.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CampFruitData(
    int fruitId,
    int fruitPos,
    List<Integer> npcRefreshContentId,
    List<Integer> usedAreaId,
    List<Integer> npcId
) {
    public static CampFruitData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CampFruitData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static CampFruitData parseFrom(java.util.List<ProtoField> fields) {
        return new CampFruitData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
