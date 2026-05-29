// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData(
    int eventType,
    List<byte[]> eventData
) {
    public static SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readBytesList(fields, 2)
        );
    }
    public static SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readBytesList(fields, 2)
        );
    }
}
