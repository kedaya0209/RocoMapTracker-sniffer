// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPetStatReq(
    long version,
    List<Integer> cachedPets,
    List<Integer> noCachedPets
) {
    public static ZoneGetPetStatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPetStatReq(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneGetPetStatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPetStatReq(
            Pojos.readLong(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
