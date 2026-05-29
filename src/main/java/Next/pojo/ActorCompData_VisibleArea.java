// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_VisibleArea(
    int enterExcludeBattleCfgId,
    int switchingToDestAreaId,
    long switchingToDestCellId,
    int lastVisibleAreaId,
    long lastVisiblePlanId,
    int lastLeaveTime,
    int lastOfflineTime,
    int preTeleEnterAreaId,
    long preTeleEnterCellId
) {
    public static ActorCompData_VisibleArea parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_VisibleArea(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9)
        );
    }
    public static ActorCompData_VisibleArea parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_VisibleArea(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9)
        );
    }
}
