// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneClientCaveStateNotify(
    String caveName,
    Position pos
) {
    public static ZoneSceneClientCaveStateNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneClientCaveStateNotify(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSceneClientCaveStateNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneClientCaveStateNotify(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
