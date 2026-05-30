// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneScenePlayActsBatchNotify(
    List<ZoneScenePlayActsNotify> acts,
    long timestamp
) {
    public static ZoneScenePlayActsBatchNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePlayActsBatchNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneScenePlayActsNotify::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneScenePlayActsBatchNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePlayActsBatchNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneScenePlayActsNotify::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
}
