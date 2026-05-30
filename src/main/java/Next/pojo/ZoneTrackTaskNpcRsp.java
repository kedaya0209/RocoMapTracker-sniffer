// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTrackTaskNpcRsp(
    RetInfo retInfo,
    List<TaskTrackingItem> trackingList,
    boolean onlyNotBreakJourney,
    List<ZoneTrackTaskNpcRsp_ParentTask> parentList
) {
    public static ZoneTrackTaskNpcRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTrackTaskNpcRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskTrackingItem::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneTrackTaskNpcRsp_ParentTask::parseFrom).toList()
        );
    }
    public static ZoneTrackTaskNpcRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTrackTaskNpcRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskTrackingItem::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.ZoneTrackTaskNpcRsp_ParentTask::parseFrom).toList()
        );
    }
}
