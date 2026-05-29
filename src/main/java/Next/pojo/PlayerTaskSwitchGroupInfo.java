// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerTaskSwitchGroupInfo(
    int groupId,
    int enableSwichId,
    List<PlayerTaskSwitchInfo> taskSwitchData
) {
    public static PlayerTaskSwitchGroupInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTaskSwitchGroupInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerTaskSwitchInfo::parseFrom).toList()
        );
    }
    public static PlayerTaskSwitchGroupInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTaskSwitchGroupInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PlayerTaskSwitchInfo::parseFrom).toList()
        );
    }
}
