// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneNewFashionSuitNotify(
    int fashionSuitId
) {
    public static ZoneSceneNewFashionSuitNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneNewFashionSuitNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneNewFashionSuitNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneNewFashionSuitNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
