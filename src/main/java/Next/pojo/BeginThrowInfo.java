// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BeginThrowInfo(
    long id,
    int throwType,
    int gid,
    Position pos,
    long throwTime,
    int confId,
    Position lastCollisionPos,
    boolean hasBroken,
    int collisionCounts,
    long createBallNpcId,
    long createBallNpcLogicId,
    long rollBackBallConfId,
    int chargeLevel
) {
    public static BeginThrowInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BeginThrowInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
    public static BeginThrowInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BeginThrowInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readBool(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
}
