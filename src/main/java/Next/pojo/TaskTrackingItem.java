// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskTrackingItem(
    int taskId,
    int type,
    List<GuideInfo> guideList
) {
    public static TaskTrackingItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskTrackingItem(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 8, 0),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.GuideInfo::parseFrom).toList()
        );
    }
    public static TaskTrackingItem parseFrom(java.util.List<ProtoField> fields) {
        return new TaskTrackingItem(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 8, 0),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.GuideInfo::parseFrom).toList()
        );
    }
}
