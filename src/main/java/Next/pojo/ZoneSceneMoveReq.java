// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneMoveReq(
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
    int sceneCfgId,
    boolean rideMove,
    Point matePoint,
    int mateMoveMode
) {
    public static ZoneSceneMoveReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneMoveReq(
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
            Pojos.readInt(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readInt(fields, 20)
        );
    }
    public static ZoneSceneMoveReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneMoveReq(
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
            Pojos.readInt(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readInt(fields, 20)
        );
    }
}
