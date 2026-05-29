// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisibleZoneData(
    List<VisiblePoolData> visiblePools,
    int areaConfId
) {
    public static VisibleZoneData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisibleZoneData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisiblePoolData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static VisibleZoneData parseFrom(java.util.List<ProtoField> fields) {
        return new VisibleZoneData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisiblePoolData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
