// Generated from world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMapMarkOperateReq(
    int opType,
    int markId,
    int type,
    int worldMapCfgId,
    byte[] name,
    Position pos,
    int layerId,
    int sceneId
) {
    public static ZoneMapMarkOperateReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMapMarkOperateReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static ZoneMapMarkOperateReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMapMarkOperateReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
