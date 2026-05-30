// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneStrongStormNty(
    boolean enter
) {
    public static ZoneSceneStrongStormNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneStrongStormNty(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZoneSceneStrongStormNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneStrongStormNty(
            Pojos.readBool(fields, 1)
        );
    }
}
