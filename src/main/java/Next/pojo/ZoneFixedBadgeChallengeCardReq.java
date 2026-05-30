// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFixedBadgeChallengeCardReq(
    int index
) {
    public static ZoneFixedBadgeChallengeCardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFixedBadgeChallengeCardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneFixedBadgeChallengeCardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFixedBadgeChallengeCardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
