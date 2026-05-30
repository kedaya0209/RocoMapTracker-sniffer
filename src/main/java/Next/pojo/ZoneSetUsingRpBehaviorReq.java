// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetUsingRpBehaviorReq(
    List<Integer> playerRpBehaviorUsingList
) {
    public static ZoneSetUsingRpBehaviorReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetUsingRpBehaviorReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneSetUsingRpBehaviorReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetUsingRpBehaviorReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
