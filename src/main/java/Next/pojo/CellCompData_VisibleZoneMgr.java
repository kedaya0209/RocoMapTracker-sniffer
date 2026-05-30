// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellCompData_VisibleZoneMgr(
    List<VisibleZoneData> visibleZones,
    int basePoolId
) {
    public static CellCompData_VisibleZoneMgr parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellCompData_VisibleZoneMgr(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisibleZoneData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static CellCompData_VisibleZoneMgr parseFrom(java.util.List<ProtoField> fields) {
        return new CellCompData_VisibleZoneMgr(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisibleZoneData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
