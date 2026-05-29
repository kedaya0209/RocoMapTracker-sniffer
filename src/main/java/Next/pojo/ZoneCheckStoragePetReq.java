// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneCheckStoragePetReq(
    List<Integer> petGids
) {
    public static ZoneCheckStoragePetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCheckStoragePetReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneCheckStoragePetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCheckStoragePetReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
