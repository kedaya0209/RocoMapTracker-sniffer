// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneEnterSceneRsp(
    RetInfo retInfo,
    int sceneCfgId,
    int sceneResCfgId,
    long sceneInstId,
    int homeRoomLevel,
    byte[] homeName,
    ActorInfo selfInfo
) {
    public static ZoneEnterSceneRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneEnterSceneRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ActorInfo.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
    public static ZoneEnterSceneRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneEnterSceneRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ActorInfo.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
}
