// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MoveInfo(
    long timeStamp,
    Position toPos,
    Position toRot,
    Position speed,
    Position acceleration,
    int moveMode,
    int customMode,
    boolean stopMove,
    List<MoveSegmentInfo> moveSegList,
    long platformActorId,
    Position ctrlRot,
    boolean rideMove
) {
    public static MoveInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MoveInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.MoveSegmentInfo::parseFrom).toList(),
            Pojos.readLong(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 17)
        );
    }
    public static MoveInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MoveInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.MoveSegmentInfo::parseFrom).toList(),
            Pojos.readLong(fields, 14),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 17)
        );
    }
}
