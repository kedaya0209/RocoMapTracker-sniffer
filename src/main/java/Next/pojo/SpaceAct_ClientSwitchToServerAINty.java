// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ClientSwitchToServerAINty(
    List<Long> actorList
) {
    public static SpaceAct_ClientSwitchToServerAINty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ClientSwitchToServerAINty(
            Pojos.readLongList(fields, 1)
        );
    }
    public static SpaceAct_ClientSwitchToServerAINty parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ClientSwitchToServerAINty(
            Pojos.readLongList(fields, 1)
        );
    }
}
