// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClearDungeonReq(
    int dungeonCfgId
) {
    public static ZoneClearDungeonReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClearDungeonReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneClearDungeonReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClearDungeonReq(
            Pojos.readInt(fields, 1)
        );
    }
}
