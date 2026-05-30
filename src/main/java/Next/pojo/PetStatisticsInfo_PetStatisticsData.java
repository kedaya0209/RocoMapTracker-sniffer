// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetStatisticsInfo_PetStatisticsData(
    int petBaseId,
    int battleCount,
    int collectCount,
    int followDuration,
    long collectedGenderBit,
    long collectedNatureBit,
    long collectedBloodBit,
    int perfectTalentCount,
    int collectedNaturebuffBit,
    List<Integer> completeProgressGid,
    List<MutationCount> mutationCount
) {
    public static PetStatisticsInfo_PetStatisticsData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetStatisticsInfo_PetStatisticsData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.MutationCount::parseFrom).toList()
        );
    }
    public static PetStatisticsInfo_PetStatisticsData parseFrom(java.util.List<ProtoField> fields) {
        return new PetStatisticsInfo_PetStatisticsData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.MutationCount::parseFrom).toList()
        );
    }
}
