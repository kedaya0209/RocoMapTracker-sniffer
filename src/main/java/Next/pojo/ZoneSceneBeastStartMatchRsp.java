// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeastStartMatchRsp(
    RetInfo retInfo,
    int result,
    int startMatchTime,
    Position beastPos
) {
    public static ZoneSceneBeastStartMatchRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeastStartMatchRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneSceneBeastStartMatchRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeastStartMatchRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
