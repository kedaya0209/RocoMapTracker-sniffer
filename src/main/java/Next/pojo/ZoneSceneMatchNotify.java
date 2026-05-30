// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneMatchNotify(
    int matchStartUt,
    int pvpId,
    int state
) {
    public static ZoneSceneMatchNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneMatchNotify(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static ZoneSceneMatchNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneMatchNotify(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
