// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SceneTaskActionInfo(
    int param,
    int actionType,
    String strParam,
    List<SceneTaskActionParaInfo> actionParainfoList,
    int isAllFinish,
    int isRetryAfterNpcCreate
) {
    public static SceneTaskActionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneTaskActionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readString(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.SceneTaskActionParaInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static SceneTaskActionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SceneTaskActionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readString(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.SceneTaskActionParaInfo::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
