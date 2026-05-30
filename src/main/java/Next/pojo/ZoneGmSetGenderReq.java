// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmSetGenderReq(
    int gender
) {
    public static ZoneGmSetGenderReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSetGenderReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static ZoneGmSetGenderReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSetGenderReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
