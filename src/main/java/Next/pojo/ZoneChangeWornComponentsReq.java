// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneChangeWornComponentsReq(
    int suitId,
    List<Integer> componentsIsWorn
) {
    public static ZoneChangeWornComponentsReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChangeWornComponentsReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneChangeWornComponentsReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChangeWornComponentsReq(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
