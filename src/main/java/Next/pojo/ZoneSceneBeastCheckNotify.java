// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeastCheckNotify(
    BeastCatchResult checkResult
) {
    public static ZoneSceneBeastCheckNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeastCheckNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BeastCatchResult.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneBeastCheckNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeastCheckNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BeastCatchResult.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
