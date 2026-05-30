// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSelectBadgeChallengeCardReq(
    int index
) {
    public static ZoneSelectBadgeChallengeCardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectBadgeChallengeCardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSelectBadgeChallengeCardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectBadgeChallengeCardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
