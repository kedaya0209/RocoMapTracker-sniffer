// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GuideInfo(
    int goIndex,
    int destSceneCfgId,
    int destResCfgId,
    int destNpcId,
    int destRefreshContentId,
    Position destPos,
    int targetSceneCfgId,
    int targetResCfgId,
    int targetNpcId,
    int targetRefreshContentId,
    Position targetPos,
    int mapSceneCfgId,
    int mapResCfgId,
    int mapNpcId,
    int mapRefreshContentId,
    Position mapPos
) {
    public static GuideInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GuideInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 16)) : null
        );
    }
    public static GuideInfo parseFrom(java.util.List<ProtoField> fields) {
        return new GuideInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 16)) : null
        );
    }
}
