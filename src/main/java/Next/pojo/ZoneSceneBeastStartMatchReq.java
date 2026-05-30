// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeastStartMatchReq(
    int battleCfgId,
    long beastLogicId,
    long beastObjId
) {
    public static ZoneSceneBeastStartMatchReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeastStartMatchReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static ZoneSceneBeastStartMatchReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeastStartMatchReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
