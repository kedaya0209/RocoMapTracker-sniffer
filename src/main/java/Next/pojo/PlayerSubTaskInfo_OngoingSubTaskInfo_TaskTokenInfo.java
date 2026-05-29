// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo(
    int taskTokenId,
    int taskTokenGetTime,
    int taskTokenState
) {
    public static PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSubTaskInfo_OngoingSubTaskInfo_TaskTokenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
