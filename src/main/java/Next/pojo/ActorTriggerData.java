// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorTriggerData(
    int triggerId,
    boolean isTriggering,
    int triggeringEndTime,
    int nextTriggerCheckTime,
    List<ActorTriggerEventData> eventData
) {
    public static ActorTriggerData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorTriggerData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ActorTriggerEventData::parseFrom).toList()
        );
    }
    public static ActorTriggerData parseFrom(java.util.List<ProtoField> fields) {
        return new ActorTriggerData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ActorTriggerEventData::parseFrom).toList()
        );
    }
}
