// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActivityContentData(
    int activityId,
    int version,
    boolean isExpired,
    List<ActivitySceneContentRefreshInfo> contentRefreshInfos
) {
    public static ActivityContentData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityContentData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ActivitySceneContentRefreshInfo::parseFrom).toList()
        );
    }
    public static ActivityContentData parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityContentData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ActivitySceneContentRefreshInfo::parseFrom).toList()
        );
    }
}
