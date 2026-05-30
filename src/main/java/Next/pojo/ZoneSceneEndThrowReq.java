// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneEndThrowReq(
    int throwType,
    int gid,
    int throwEffect,
    List<ThrowTargetNpcInfo> throwTargetNpcInfos,
    long throwId,
    Position endThrowPos,
    int flyDistance,
    List<Integer> params,
    ThrowBattleInfo throwBattleInfo,
    ThrowCreateInfo throwCreateInfo,
    ThrowMagicInfo throwMagicInfo,
    ThrowCombineInfo throwCombineInfo,
    ThrowStatusInfo throwStatusInfo,
    int itemConfId
) {
    public static ZoneSceneEndThrowReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneEndThrowReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ThrowTargetNpcInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ThrowBattleInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.ThrowCreateInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.ThrowMagicInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ThrowCombineInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ThrowStatusInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16)
        );
    }
    public static ZoneSceneEndThrowReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneEndThrowReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ThrowTargetNpcInfo::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ThrowBattleInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.ThrowCreateInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.ThrowMagicInfo.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ThrowCombineInfo.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.ThrowStatusInfo.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readInt(fields, 16)
        );
    }
}
