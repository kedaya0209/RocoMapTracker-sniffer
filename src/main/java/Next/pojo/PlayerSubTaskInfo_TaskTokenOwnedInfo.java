// Generated from com_task.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSubTaskInfo_TaskTokenOwnedInfo(
    int taskTokenId,
    int taskTokenGetTime
) {
    public static PlayerSubTaskInfo_TaskTokenOwnedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSubTaskInfo_TaskTokenOwnedInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerSubTaskInfo_TaskTokenOwnedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSubTaskInfo_TaskTokenOwnedInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
