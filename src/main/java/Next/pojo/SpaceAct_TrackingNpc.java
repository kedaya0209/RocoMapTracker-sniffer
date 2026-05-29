// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_TrackingNpc(
    List<TaskTrackingItem> trackingList
) {
    public static SpaceAct_TrackingNpc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_TrackingNpc(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskTrackingItem::parseFrom).toList()
        );
    }
    public static SpaceAct_TrackingNpc parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_TrackingNpc(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TaskTrackingItem::parseFrom).toList()
        );
    }
}
