// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGmQueryNpcBlackboardReq(
    List<Long> actorList
) {
    public static ZoneSceneGmQueryNpcBlackboardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGmQueryNpcBlackboardReq(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneSceneGmQueryNpcBlackboardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGmQueryNpcBlackboardReq(
            Pojos.readLongList(fields, 1)
        );
    }
}
