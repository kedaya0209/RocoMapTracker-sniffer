// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellInfo_HomePlantInfo(
    List<CellHomePlant_LandData> homePlantLandList
) {
    public static CellInfo_HomePlantInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellInfo_HomePlantInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CellHomePlant_LandData::parseFrom).toList()
        );
    }
    public static CellInfo_HomePlantInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CellInfo_HomePlantInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CellHomePlant_LandData::parseFrom).toList()
        );
    }
}
