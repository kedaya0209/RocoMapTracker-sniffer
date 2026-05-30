// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ServerFly(
    long actorId,
    Position curDir,
    Position curPos,
    Position ctrlPos1,
    Position ctrlPos2,
    Position anchorPos,
    int splitNum,
    int flySpeed,
    List<Position> toPosList,
    long endTime,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo,
    List<Long> toTimestampList
) {
    public static SpaceAct_ServerFly parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ServerFly(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readLong(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readLongList(fields, 13)
        );
    }
    public static SpaceAct_ServerFly parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ServerFly(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readLong(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readLongList(fields, 13)
        );
    }
}
