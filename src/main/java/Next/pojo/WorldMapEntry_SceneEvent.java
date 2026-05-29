// Generated from com_world_map.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldMapEntry_SceneEvent(
    SceneEventInfo eventInfo
) {
    public static WorldMapEntry_SceneEvent parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldMapEntry_SceneEvent(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SceneEventInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static WorldMapEntry_SceneEvent parseFrom(java.util.List<ProtoField> fields) {
        return new WorldMapEntry_SceneEvent(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SceneEventInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
