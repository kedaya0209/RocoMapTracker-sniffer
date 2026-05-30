// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ServerMove(
    long actorId,
    long moveMode,
    List<Long> toTimeList,
    List<Position> toPosList,
    List<Integer> toDirList,
    long moveSubMode,
    int height,
    int heightLerpRate,
    SvrAISyncCommonInfo syncCommonInfo,
    int acceptRadius,
    boolean isBackward
) {
    public static SpaceAct_ServerMove parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ServerMove(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLongList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readBool(fields, 11)
        );
    }
    public static SpaceAct_ServerMove parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ServerMove(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLongList(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readIntList(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readInt(fields, 10),
            Pojos.readBool(fields, 11)
        );
    }
}
