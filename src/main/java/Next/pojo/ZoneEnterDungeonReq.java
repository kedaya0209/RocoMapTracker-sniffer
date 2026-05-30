// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneEnterDungeonReq(
    int dungeonId
) {
    public static ZoneEnterDungeonReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneEnterDungeonReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneEnterDungeonReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneEnterDungeonReq(
            Pojos.readInt(fields, 1)
        );
    }
}
