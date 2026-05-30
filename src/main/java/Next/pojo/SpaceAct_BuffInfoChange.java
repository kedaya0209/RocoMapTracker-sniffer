// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_BuffInfoChange(
    long actorId,
    long removedBuffId,
    int buffChangedReason,
    ActorInfo_Buff changedBuffInfo
) {
    public static SpaceAct_BuffInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_BuffInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_Buff.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static SpaceAct_BuffInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_BuffInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_Buff.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
