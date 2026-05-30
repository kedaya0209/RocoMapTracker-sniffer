// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_ClientMove(
    long actorId,
    long timeStamp,
    Position toPos,
    Position toRot,
    Position speed,
    Position acceleration,
    int moveMode,
    int customMode,
    boolean stopMove,
    Position ctrlRot,
    boolean rideMove,
    Point matePoint,
    int mateMoveMode
) {
    public static SpaceAct_ClientMove parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ClientMove(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readInt(fields, 18)
        );
    }
    public static SpaceAct_ClientMove parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ClientMove(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readBool(fields, 16),
            Pojos.readMessage(fields, 17) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 17)) : null,
            Pojos.readInt(fields, 18)
        );
    }
}
