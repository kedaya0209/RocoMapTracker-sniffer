// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneActivitySelectTrackContentsReq(
    List<Integer> petBaseId,
    List<Integer> trackContentIds,
    boolean cancelTrace
) {
    public static ZoneActivitySelectTrackContentsReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneActivitySelectTrackContentsReq(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneActivitySelectTrackContentsReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneActivitySelectTrackContentsReq(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
