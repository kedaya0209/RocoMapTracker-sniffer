// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmSetEggHatchCompleteReq(
    int eggGid
) {
    public static ZoneGmSetEggHatchCompleteReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSetEggHatchCompleteReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGmSetEggHatchCompleteReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSetEggHatchCompleteReq(
            Pojos.readInt(fields, 1)
        );
    }
}
