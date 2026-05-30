// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ThrowBattleInfo(
    Point avatarPt,
    Point npcPt,
    int radius,
    ClientNpcBlackboard npcAiBlackboard,
    Point battleCenter,
    List<CheerMonsterInitInfo> cheerMonsterInitInfo,
    boolean isBattleAction,
    int battleType,
    int rideId,
    List<Long> onlookerObjId,
    int visitRemainShinyCatchTimes
) {
    public static ThrowBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowBattleInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ClientNpcBlackboard.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.CheerMonsterInitInfo::parseFrom).toList(),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readLongList(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static ThrowBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowBattleInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.ClientNpcBlackboard.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.CheerMonsterInitInfo::parseFrom).toList(),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readLongList(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
