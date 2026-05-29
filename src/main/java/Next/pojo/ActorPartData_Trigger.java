// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorPartData_Trigger(
    List<TriggerMoveHist> moveHistory
) {
    public static ActorPartData_Trigger parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPartData_Trigger(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TriggerMoveHist::parseFrom).toList()
        );
    }
    public static ActorPartData_Trigger parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPartData_Trigger(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.TriggerMoveHist::parseFrom).toList()
        );
    }
}
