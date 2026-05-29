// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AgentStartReqData(
    String aiType,
    String gameSettingsPath,
    String modelPath,
    AIModelWarmControl warmControl
) {
    public static AgentStartReqData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AgentStartReqData(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.AIModelWarmControl.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static AgentStartReqData parseFrom(java.util.List<ProtoField> fields) {
        return new AgentStartReqData(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.AIModelWarmControl.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
