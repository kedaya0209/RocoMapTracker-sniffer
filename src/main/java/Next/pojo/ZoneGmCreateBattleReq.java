// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmCreateBattleReq(
    int battleConfId,
    int npcConfId,
    int npcLevel,
    long npcObjId,
    Point avatarPt,
    Point npcPt,
    List<Integer> friendUins,
    List<Integer> enemyUins,
    List<Long> enemyZoneIds,
    PvpModeCtl pvpMode,
    List<GmBattleNpc> dynamicNpcs,
    boolean disableAntiCheat,
    boolean skillToolMode,
    int aiType,
    int firstPet,
    long replayBfid
) {
    public static ZoneGmCreateBattleReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmCreateBattleReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readIntList(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readLongList(fields, 12),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PvpModeCtl.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessageList(fields, 15).stream().map(Next.pojo.GmBattleNpc::parseFrom).toList(),
            Pojos.readBool(fields, 16),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 18)
        );
    }
    public static ZoneGmCreateBattleReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmCreateBattleReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readIntList(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readLongList(fields, 12),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PvpModeCtl.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessageList(fields, 15).stream().map(Next.pojo.GmBattleNpc::parseFrom).toList(),
            Pojos.readBool(fields, 16),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readLong(fields, 18)
        );
    }
}
