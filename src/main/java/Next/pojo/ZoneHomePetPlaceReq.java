// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetPlaceReq(
    int petGid,
    long furnitureGuid,
    Point bornPt
) {
    public static ZoneHomePetPlaceReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetPlaceReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneHomePetPlaceReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetPlaceReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
