// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePlayerServerInfoNotify(
    String zonesvrBusppInstId,
    String scenesvrBusppInstId,
    String battlesvrBusppInstId,
    String zonePlayerLastSyncTime,
    String sceneLastUpdateTimestampInUs,
    String cellId,
    long faketimeOffsetInMillis
) {
    public static ZoneScenePlayerServerInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePlayerServerInfoNotify(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
    public static ZoneScenePlayerServerInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePlayerServerInfoNotify(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readString(fields, 6),
            Pojos.readLong(fields, 7)
        );
    }
}
