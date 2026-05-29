// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleEnterNotify(
    int battleMode,
    int round,
    int seriesIndex,
    long roundTime,
    BattleInitInfo initInfo,
    Point avatarPt,
    Point npcPt,
    List<Long> npcId,
    boolean isReconnect,
    int enterBattleType,
    Position battleCenter,
    int weatherId,
    int weatherExpireRound,
    int waterBattleType,
    int maxRound,
    int rotate,
    int createrUin,
    int dataSeqNum
) {
    public static ZoneBattleEnterNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleEnterNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BattleInitInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLongList(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
    public static ZoneBattleEnterNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleEnterNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BattleInitInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLongList(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
}
