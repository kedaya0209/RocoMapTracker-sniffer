// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetStatisticsInfo(
    List<PetStatisticsInfo_PetStatisticsData> petStatisticsData
) {
    public static PetStatisticsInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetStatisticsInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetStatisticsInfo_PetStatisticsData::parseFrom).toList()
        );
    }
    public static PetStatisticsInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetStatisticsInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetStatisticsInfo_PetStatisticsData::parseFrom).toList()
        );
    }
}
