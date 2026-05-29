// Generated from com_world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldMapNpcInfo(
    long npcLogicId,
    int npcCfgId,
    int npcRefreshId,
    Position npcPos,
    int npcLevel,
    int npcRemainTime,
    int status,
    long createAvatarId,
    String createAvatarName,
    int layerId
) {
    public static WorldMapNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static WorldMapNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readString(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
