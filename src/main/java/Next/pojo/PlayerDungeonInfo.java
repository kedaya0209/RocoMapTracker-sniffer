// Generated from com_dungeon.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerDungeonInfo(
    List<DungeonInfo> dungeonInfos,
    boolean delayResetCheck,
    long backToBigworldSceneId,
    Point backToBigworldPt,
    int willToDungeonCfgId
) {
    public static PlayerDungeonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerDungeonInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DungeonInfo::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
    public static PlayerDungeonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerDungeonInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DungeonInfo::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
}
