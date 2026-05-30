// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneDungeonInfoQueryReq(
    int dungeonCfgId
) {
    public static ZoneSceneDungeonInfoQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneDungeonInfoQueryReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneDungeonInfoQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneDungeonInfoQueryReq(
            Pojos.readInt(fields, 1)
        );
    }
}
