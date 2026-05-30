// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneClientEnterSceneFinishNtyAck(
    RetInfo retInfo,
    boolean enabledNoLoadingTeleport,
    List<ActorInfo> otherActors,
    List<Long> deletedOtherActorIds,
    int addOrUpdateOtherActorsTotalBatch,
    SelfActorAdjustData adjustData,
    HomeInfo homeInfo
) {
    public static ZoneSceneClientEnterSceneFinishNtyAck parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneClientEnterSceneFinishNtyAck(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.ActorInfo::parseFrom).toList(),
            Pojos.readLongList(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.SelfActorAdjustData.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.HomeInfo.parseFrom(Pojos.readMessage(fields, 22)) : null
        );
    }
    public static ZoneSceneClientEnterSceneFinishNtyAck parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneClientEnterSceneFinishNtyAck(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.ActorInfo::parseFrom).toList(),
            Pojos.readLongList(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 21) != null ? Next.pojo.SelfActorAdjustData.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readMessage(fields, 22) != null ? Next.pojo.HomeInfo.parseFrom(Pojos.readMessage(fields, 22)) : null
        );
    }
}
