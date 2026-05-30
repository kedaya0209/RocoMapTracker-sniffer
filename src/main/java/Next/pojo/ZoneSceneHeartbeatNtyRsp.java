// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHeartbeatNtyRsp(
    long heartbeatSeq,
    String passData
) {
    public static ZoneSceneHeartbeatNtyRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHeartbeatNtyRsp(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 6)
        );
    }
    public static ZoneSceneHeartbeatNtyRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHeartbeatNtyRsp(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 6)
        );
    }
}
