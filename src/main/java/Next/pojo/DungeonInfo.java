// Generated from com_dungeon.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DungeonInfo(
    int dungeonId,
    int lastEnterTime,
    int dungeonFinishCount,
    int totalFinishCount,
    long dungeonInstId,
    long sceneInstId,
    long cellId,
    Point pt,
    boolean destroy,
    boolean lastQuitHalfway,
    int fromSceneCfgId,
    Point fromPos,
    boolean currentFinish,
    int lastLeaveTime,
    List<Integer> openStageIds,
    boolean ackBstFinish,
    List<Integer> finishStageIds,
    boolean needResetStage,
    long firstEnterTime,
    long firstFinishTime,
    boolean collectFinish,
    List<Integer> finishedStageIds
) {
    public static DungeonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DungeonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readIntList(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readLong(fields, 20),
            Pojos.readBool(fields, 21),
            Pojos.readIntList(fields, 22)
        );
    }
    public static DungeonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DungeonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readIntList(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readIntList(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readLong(fields, 19),
            Pojos.readLong(fields, 20),
            Pojos.readBool(fields, 21),
            Pojos.readIntList(fields, 22)
        );
    }
}
