// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBadgeChallengeEnterReq(
    int nodeId
) {
    public static ZoneBadgeChallengeEnterReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBadgeChallengeEnterReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneBadgeChallengeEnterReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBadgeChallengeEnterReq(
            Pojos.readInt(fields, 1)
        );
    }
}
