// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneClientEventReq(
    List<Integer> clientEvent
) {
    public static ZoneSceneClientEventReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneClientEventReq(
            Pojos.readIntList(fields, 4)
        );
    }
    public static ZoneSceneClientEventReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneClientEventReq(
            Pojos.readIntList(fields, 4)
        );
    }
}
