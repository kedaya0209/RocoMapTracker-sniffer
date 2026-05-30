// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMageBookAwardReq(
    int npcId
) {
    public static ZoneMageBookAwardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMageBookAwardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneMageBookAwardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMageBookAwardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
