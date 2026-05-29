// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RecoverMsgList(
    List<RecoverMsgData> recoverDataList,
    long lastUpdateTime,
    SceneTaskActionNpcDelayList delayNpcActions,
    TaskScenesvrStateData sceneStateData,
    TaskProgressData taskProgressData,
    long finishIdipSeq,
    int lastTickTime,
    int needRecoverAll,
    int needRecoverAllSetTime,
    TaskTrackRecoverList trackRecoverList,
    SceneTaskActionNpcDelayList homeDelayNpcActions
) {
    public static RecoverMsgList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecoverMsgList(
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RecoverMsgData::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SceneTaskActionNpcDelayList.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.TaskScenesvrStateData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.TaskProgressData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.TaskTrackRecoverList.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.SceneTaskActionNpcDelayList.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
    public static RecoverMsgList parseFrom(java.util.List<ProtoField> fields) {
        return new RecoverMsgList(
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RecoverMsgData::parseFrom).toList(),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SceneTaskActionNpcDelayList.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.TaskScenesvrStateData.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.TaskProgressData.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 14) != null ? Next.pojo.TaskTrackRecoverList.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.SceneTaskActionNpcDelayList.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
}
