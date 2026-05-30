// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmPlayerMoveCheckModifyReq(
    boolean cancelCheckPos,
    boolean openAirwallDead,
    boolean enableTips
) {
    public static ZoneGmPlayerMoveCheckModifyReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmPlayerMoveCheckModifyReq(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneGmPlayerMoveCheckModifyReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmPlayerMoveCheckModifyReq(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
