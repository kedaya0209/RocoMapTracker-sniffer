// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_OptActionNtf(
    int actionType,
    long npcId,
    int seatIdx,
    int leavePointIdx,
    boolean isClientReqLeaveSeat,
    Point beforeSitPoint
) {
    public static SpaceAct_OptActionNtf parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_OptActionNtf(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static SpaceAct_OptActionNtf parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_OptActionNtf(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
