// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellCompData_HomePlant(
    boolean unlock,
    List<CellHomePlant_LandData> homePlantLandList
) {
    public static CellCompData_HomePlant parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellCompData_HomePlant(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CellHomePlant_LandData::parseFrom).toList()
        );
    }
    public static CellCompData_HomePlant parseFrom(java.util.List<ProtoField> fields) {
        return new CellCompData_HomePlant(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CellHomePlant_LandData::parseFrom).toList()
        );
    }
}
