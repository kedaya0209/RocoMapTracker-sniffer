// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetFetchAwardReq(
    long npcObjId,
    int petGid
) {
    public static ZoneHomePetFetchAwardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetFetchAwardReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneHomePetFetchAwardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetFetchAwardReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
