// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmSwitchServerAiToClientReq(
    List<Long> actorList,
    boolean isBatchSwitch
) {
    public static ZoneGmSwitchServerAiToClientReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSwitchServerAiToClientReq(
            Pojos.readLongList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneGmSwitchServerAiToClientReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSwitchServerAiToClientReq(
            Pojos.readLongList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
