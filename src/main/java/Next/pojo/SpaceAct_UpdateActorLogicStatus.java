// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_UpdateActorLogicStatus(
    long actorId,
    List<SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo> changeInfo
) {
    public static SpaceAct_UpdateActorLogicStatus parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_UpdateActorLogicStatus(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_UpdateActorLogicStatus parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_UpdateActorLogicStatus(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo::parseFrom).toList()
        );
    }
}
