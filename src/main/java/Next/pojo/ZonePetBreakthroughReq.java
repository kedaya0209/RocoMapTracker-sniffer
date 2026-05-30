// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBreakthroughReq(
    int gid
) {
    public static ZonePetBreakthroughReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBreakthroughReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetBreakthroughReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBreakthroughReq(
            Pojos.readInt(fields, 1)
        );
    }
}
