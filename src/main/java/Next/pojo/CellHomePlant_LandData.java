// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellHomePlant_LandData(
    int landCfgId,
    long noticeBoardActorId,
    List<HomePlant_PlantData> plantList,
    List<HomePlant_StealExpel> stealExpel
) {
    public static CellHomePlant_LandData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellHomePlant_LandData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomePlant_PlantData::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.HomePlant_StealExpel::parseFrom).toList()
        );
    }
    public static CellHomePlant_LandData parseFrom(java.util.List<ProtoField> fields) {
        return new CellHomePlant_LandData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomePlant_PlantData::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.HomePlant_StealExpel::parseFrom).toList()
        );
    }
}
