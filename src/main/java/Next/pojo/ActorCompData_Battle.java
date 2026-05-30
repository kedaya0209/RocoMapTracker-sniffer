// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Battle(
    long battleNpcId,
    long battleNpcLogicId,
    int optionId,
    CreateBattleInfo createInfo,
    boolean hasBattleSettled,
    boolean hasBattleEnded,
    boolean isRtTeamFight,
    int battleType,
    int battleStartGameTime,
    InnerBattleInfo info,
    int enterBattleTime,
    List<Long> catchedNpcObjIds,
    boolean isAllowObserve,
    int visitOwnerUin
) {
    public static ActorCompData_Battle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Battle(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.CreateBattleInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.InnerBattleInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readLongList(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14)
        );
    }
    public static ActorCompData_Battle parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Battle(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.CreateBattleInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBool(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.InnerBattleInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readLongList(fields, 12),
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14)
        );
    }
}
