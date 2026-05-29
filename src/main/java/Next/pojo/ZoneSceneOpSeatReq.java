// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneOpSeatReq(
    int opType,
    long npcId,
    int seatIdx,
    int leavePointIdx,
    boolean normalLeaveSeat
) {
    public static ZoneSceneOpSeatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneOpSeatReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static ZoneSceneOpSeatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneOpSeatReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
