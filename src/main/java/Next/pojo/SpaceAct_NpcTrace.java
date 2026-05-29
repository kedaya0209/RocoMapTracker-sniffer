// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NpcTrace(
    NpcTraceInfo npcTraceInfo
) {
    public static SpaceAct_NpcTrace parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcTrace(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.NpcTraceInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static SpaceAct_NpcTrace parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcTrace(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.NpcTraceInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
