// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneNewSalonItemNotify(
    List<Integer> salonItemIds,
    boolean isDeduct
) {
    public static ZoneNewSalonItemNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneNewSalonItemNotify(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneNewSalonItemNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneNewSalonItemNotify(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
