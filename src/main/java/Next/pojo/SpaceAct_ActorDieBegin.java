// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ActorDieBegin(
    long actorId,
    long curTime,
    String skillOrAnim,
    boolean isSkill,
    int playTime,
    int dieReason,
    long killer,
    Position dir,
    List<Integer> dieReasonParams,
    List<Long> dieReasonParams64
) {
    public static SpaceAct_ActorDieBegin parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ActorDieBegin(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readIntList(fields, 9),
            Pojos.readLongList(fields, 10)
        );
    }
    public static SpaceAct_ActorDieBegin parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ActorDieBegin(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readIntList(fields, 9),
            Pojos.readLongList(fields, 10)
        );
    }
}
