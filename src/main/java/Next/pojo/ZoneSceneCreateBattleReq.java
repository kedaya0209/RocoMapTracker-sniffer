// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneCreateBattleReq(
    SourceData sourceData,
    int battleConfId,
    int npcConfId,
    int npcLevel,
    long npcObjId,
    Point avatarPt,
    Point npcPt,
    int optionId,
    long npcLogicId,
    List<CheerMonsterInitInfo> cheerNpcs,
    List<BattleTaskInfo> taskInfos
) {
    public static ZoneSceneCreateBattleReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCreateBattleReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SourceData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.CheerMonsterInitInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.BattleTaskInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneCreateBattleReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCreateBattleReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SourceData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.CheerMonsterInitInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.BattleTaskInfo::parseFrom).toList()
        );
    }
}
