// Generated from com_rpc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TaskTrackRecoverList(
    List<TaskTrackRecoverInfo> items
) {
    public static TaskTrackRecoverList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TaskTrackRecoverList(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskTrackRecoverInfo::parseFrom).toList()
        );
    }
    public static TaskTrackRecoverList parseFrom(java.util.List<ProtoField> fields) {
        return new TaskTrackRecoverList(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.TaskTrackRecoverInfo::parseFrom).toList()
        );
    }
}
