// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePvpInfoQueryReq(
    boolean wholeTrialPets
) {
    public static ZonePvpInfoQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePvpInfoQueryReq(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZonePvpInfoQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePvpInfoQueryReq(
            Pojos.readBool(fields, 1)
        );
    }
}
