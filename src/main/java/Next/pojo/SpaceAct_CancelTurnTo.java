// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_CancelTurnTo(
    long actorId,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo
) {
    public static SpaceAct_CancelTurnTo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CancelTurnTo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static SpaceAct_CancelTurnTo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CancelTurnTo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
