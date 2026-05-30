// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmDeleteRedPointDataReq(
    List<Integer> redpointReason
) {
    public static ZoneGmDeleteRedPointDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmDeleteRedPointDataReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneGmDeleteRedPointDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmDeleteRedPointDataReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
