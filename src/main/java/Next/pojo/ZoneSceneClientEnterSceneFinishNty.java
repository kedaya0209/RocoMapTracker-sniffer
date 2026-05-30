// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneClientEnterSceneFinishNty(
    long actorId,
    String featureData
) {
    public static ZoneSceneClientEnterSceneFinishNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneClientEnterSceneFinishNty(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static ZoneSceneClientEnterSceneFinishNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneClientEnterSceneFinishNty(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
