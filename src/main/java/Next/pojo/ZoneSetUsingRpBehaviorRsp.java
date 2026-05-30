// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetUsingRpBehaviorRsp(
    RetInfo retInfo,
    List<Integer> playerRpBehaviorUsingList
) {
    public static ZoneSetUsingRpBehaviorRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetUsingRpBehaviorRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneSetUsingRpBehaviorRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetUsingRpBehaviorRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2)
        );
    }
}
