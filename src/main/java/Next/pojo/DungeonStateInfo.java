// Generated from com_dungeon.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DungeonStateInfo(
    int dungeonId,
    int dungeonState,
    int doneCount,
    boolean entered,
    int fromSceneCfgId,
    Point fromPt,
    boolean needBstFinish,
    List<Integer> finishStageIds,
    List<Integer> finishedStageIds
) {
    public static DungeonStateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DungeonStateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readIntList(fields, 9)
        );
    }
    public static DungeonStateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DungeonStateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readIntList(fields, 9)
        );
    }
}
