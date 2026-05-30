// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxTidyReq(
    int lastOpenBoxId
) {
    public static ZonePetBoxTidyReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxTidyReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetBoxTidyReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxTidyReq(
            Pojos.readInt(fields, 1)
        );
    }
}
