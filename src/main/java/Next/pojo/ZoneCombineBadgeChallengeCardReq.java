// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneCombineBadgeChallengeCardReq(
    List<Integer> indexes
) {
    public static ZoneCombineBadgeChallengeCardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCombineBadgeChallengeCardReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneCombineBadgeChallengeCardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCombineBadgeChallengeCardReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
