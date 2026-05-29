// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePetTreeInteractHoldReq(
    long petNpcId
) {
    public static ZoneScenePetTreeInteractHoldReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePetTreeInteractHoldReq(
            Pojos.readLong(fields, 1)
        );
    }
    public static ZoneScenePetTreeInteractHoldReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePetTreeInteractHoldReq(
            Pojos.readLong(fields, 1)
        );
    }
}
