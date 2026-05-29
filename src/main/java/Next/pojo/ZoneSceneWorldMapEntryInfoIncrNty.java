// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneWorldMapEntryInfoIncrNty(
    int batchId,
    int totalBatch,
    WorldMapEntries entries
) {
    public static ZoneSceneWorldMapEntryInfoIncrNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneWorldMapEntryInfoIncrNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneSceneWorldMapEntryInfoIncrNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneWorldMapEntryInfoIncrNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.WorldMapEntries.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
