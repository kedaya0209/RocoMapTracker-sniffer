// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_ActorBornEnd(
    long actorId,
    long curTime
) {
    public static SpaceAct_ActorBornEnd parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ActorBornEnd(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static SpaceAct_ActorBornEnd parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ActorBornEnd(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
