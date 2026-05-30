// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo(
    int opType,
    ActorInfo_LogicStatus changedStatus
) {
    public static SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_LogicStatus.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_UpdateActorLogicStatus_LogicStatusChangeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_LogicStatus.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
