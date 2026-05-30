// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorTriggerEventData(
    int eventIndex,
    List<ActorTriggerEventNpcGenerateData> npcGenerateData
) {
    public static ActorTriggerEventData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorTriggerEventData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorTriggerEventNpcGenerateData::parseFrom).toList()
        );
    }
    public static ActorTriggerEventData parseFrom(java.util.List<ProtoField> fields) {
        return new ActorTriggerEventData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorTriggerEventNpcGenerateData::parseFrom).toList()
        );
    }
}
