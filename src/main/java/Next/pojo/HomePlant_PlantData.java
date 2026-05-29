// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePlant_PlantData(
    int plantId,
    long plantBlankActorId,
    int plantState,
    int plantSeedId,
    long plantActorId,
    long plantTime,
    long plantRipTime,
    long plantRipCfgTime,
    int plantHarvestId,
    int plantHarvestNum,
    int plantHarvestVitemType,
    int plantHarvestVitemValue,
    long plantTabId,
    long plantWaterTime,
    long plantManureTime,
    int plantManureAddHarvestPer,
    List<Integer> plantStealPlayers,
    int plantStealAccount,
    int plantCanStealAccount
) {
    public static HomePlant_PlantData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePlant_PlantData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 15),
            Pojos.readLong(fields, 20),
            Pojos.readLong(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readIntList(fields, 40),
            Pojos.readInt(fields, 41),
            Pojos.readInt(fields, 42)
        );
    }
    public static HomePlant_PlantData parseFrom(java.util.List<ProtoField> fields) {
        return new HomePlant_PlantData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readLong(fields, 15),
            Pojos.readLong(fields, 20),
            Pojos.readLong(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readIntList(fields, 40),
            Pojos.readInt(fields, 41),
            Pojos.readInt(fields, 42)
        );
    }
}
