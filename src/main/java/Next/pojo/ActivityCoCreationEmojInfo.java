// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActivityCoCreationEmojInfo(
    List<ActivityCoCreationEmojItem> emojList
) {
    public static ActivityCoCreationEmojInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityCoCreationEmojInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActivityCoCreationEmojItem::parseFrom).toList()
        );
    }
    public static ActivityCoCreationEmojInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityCoCreationEmojInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActivityCoCreationEmojItem::parseFrom).toList()
        );
    }
}
