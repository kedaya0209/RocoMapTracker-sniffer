// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBattlePassTaskInfo(
    List<Integer> dailyTaskIds,
    List<Integer> repeatTaskIds,
    long lastDailyTaskResetTime,
    List<PlayerTaskInfo> taskInfoList
) {
    public static PlayerBattlePassTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattlePassTaskInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList()
        );
    }
    public static PlayerBattlePassTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattlePassTaskInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList()
        );
    }
}
