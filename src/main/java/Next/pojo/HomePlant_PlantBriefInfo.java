// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePlant_PlantBriefInfo(
    int plantId,
    int plantState,
    int plantSeedId,
    long plantRipTime,
    int plantHarvestNum,
    long plantTabId,
    List<Integer> plantStealPlayers,
    int plantStealAccount,
    int plantCanStealAccount
) {
    public static HomePlant_PlantBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePlant_PlantBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 15),
            Pojos.readIntList(fields, 40),
            Pojos.readInt(fields, 41),
            Pojos.readInt(fields, 42)
        );
    }
    public static HomePlant_PlantBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePlant_PlantBriefInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 15),
            Pojos.readIntList(fields, 40),
            Pojos.readInt(fields, 41),
            Pojos.readInt(fields, 42)
        );
    }
}
