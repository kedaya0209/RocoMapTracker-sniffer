// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneNpcNextActReq(
    int trigInteractType,
    long npcId,
    int optionId,
    Point avatarPt,
    Point npcPt,
    int data1,
    int battleRadius,
    int curDialogId,
    Point battleCenter,
    boolean firstAct,
    byte[] commitCurActParams,
    byte[] beginNextActParams,
    ClientNpcBlackboard npcAiBlackboard,
    List<CheerMonsterInitInfo> cheerMonsterInitInfo,
    int battleType,
    int rideId,
    List<Long> onlookerObjId,
    byte[] extraData,
    boolean beginSkipDialog,
    int sitNpcSeatIdx,
    Point beforeSitPoint
) {
    public static ZoneSceneNpcNextActReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNpcNextActReq(
            Pojos.readInt(fields, 8, 0),
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 11),
            Pojos.readBytes(fields, 12),
            Pojos.readBytes(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ClientNpcBlackboard.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.CheerMonsterInitInfo::parseFrom).toList(),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readLongList(fields, 19),
            Pojos.readBytes(fields, 21),
            Pojos.readBool(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readMessage(fields, 24) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 24)) : null
        );
    }
    public static ZoneSceneNpcNextActReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNpcNextActReq(
            Pojos.readInt(fields, 8, 0),
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readBool(fields, 11),
            Pojos.readBytes(fields, 12),
            Pojos.readBytes(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ClientNpcBlackboard.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessageList(fields, 16).stream().map(Next.pojo.CheerMonsterInitInfo::parseFrom).toList(),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readLongList(fields, 19),
            Pojos.readBytes(fields, 21),
            Pojos.readBool(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readMessage(fields, 24) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 24)) : null
        );
    }
}
