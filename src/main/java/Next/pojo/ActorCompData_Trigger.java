// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Trigger(
    List<ActorTriggerData> triggerData,
    List<Integer> generatedContentIds,
    int currentUsedContentId
) {
    public static ActorCompData_Trigger parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Trigger(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorTriggerData::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ActorCompData_Trigger parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Trigger(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorTriggerData::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
