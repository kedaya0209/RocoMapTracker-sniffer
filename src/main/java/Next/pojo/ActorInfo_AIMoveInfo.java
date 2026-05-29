// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_AIMoveInfo(
    ActorInfo_AIMoveMode moveMode,
    ActorInfo_AINavMove navMoveInfo,
    ActorInfo_AIBezierFly bezierFlyInfo,
    ActorInfo_AIJump jumpInfo,
    ActorInfo_AITurnTo turnToInfo,
    ActorInfo_AIStickTo stickToInfo
) {
    public static ActorInfo_AIMoveInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AIMoveInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_AIMoveMode.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_AINavMove.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_AIBezierFly.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ActorInfo_AIJump.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_AITurnTo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_AIStickTo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ActorInfo_AIMoveInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AIMoveInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorInfo_AIMoveMode.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_AINavMove.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_AIBezierFly.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ActorInfo_AIJump.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_AITurnTo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_AIStickTo.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
