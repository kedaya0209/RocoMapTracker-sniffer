// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneClientEventReq_ClientEvent(
    int event,
    boolean isStart,
    byte[] tag
) {
    public static ZoneSceneClientEventReq_ClientEvent parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneClientEventReq_ClientEvent(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static ZoneSceneClientEventReq_ClientEvent parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneClientEventReq_ClientEvent(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
