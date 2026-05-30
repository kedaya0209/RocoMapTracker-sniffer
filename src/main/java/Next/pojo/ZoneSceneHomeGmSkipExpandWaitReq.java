// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeGmSkipExpandWaitReq(
    int remainWaitSecs
) {
    public static ZoneSceneHomeGmSkipExpandWaitReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeGmSkipExpandWaitReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneHomeGmSkipExpandWaitReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeGmSkipExpandWaitReq(
            Pojos.readInt(fields, 1)
        );
    }
}
