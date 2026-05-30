// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneScenePerceivingNpcReq(
    List<Long> npcIds
) {
    public static ZoneScenePerceivingNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePerceivingNpcReq(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ZoneScenePerceivingNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePerceivingNpcReq(
            Pojos.readLongList(fields, 1)
        );
    }
}
